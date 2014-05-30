import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class SYSUAvatar {
	public void getAvatar() throws IOException{
		
		for(int i=12214015; i < 12214016; i++){
			String baseUrl = "http://ecampus.sysu.edu.cn/zsuyy/yanyuan/xj/studentmng.do?method=showPic&zzp=2012/1221/%d.jpg";
			URL url = new URL(String.format(baseUrl, i));
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream(String.valueOf(i) + ".jpg");

			byte[] b = new byte[2048];
			int length;
			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
			}
			is.close();
			os.close();			
		}
	}
	
	public static void main(String[] args) throws IOException{
		SYSUAvatar avatar = new SYSUAvatar();
		avatar.getAvatar();
	}
	
}
