package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {

	public static void main(String[] args) throws MalformedURLException {

		//1.取得對方網站的Inputstream
		URL url = new URL("https://scontent.ftpe8-1.fna.fbcdn.net/v/t1.6435-1/p200x200/106017999_10158555984039421_8311718496184631878_n.jpg?_nc_cat=108&ccb=1-3&_nc_sid=dbb9e7&_nc_ohc=ahAF_kwQsw8AX9FpUnv&_nc_ht=scontent.ftpe8-1.fna&tp=6&oh=c6c0e843b7ef963fbc8b78c6ecd112cd&oe=60C9B046");
	    try ( InputStream openStream =  url.openStream();
              FileOutputStream fos = new FileOutputStream("D:\\Java\\a.jpg");//看你下載的副檔名是什麼
				//Buffered 加速
				BufferedInputStream bis = new BufferedInputStream(openStream);
	    		BufferedOutputStream bos = new BufferedOutputStream(fos);
				){
			    byte[] buffer = new byte[1024];
			    int length;
			    while ( (length = bis.read(buffer)) !=-1 ) {
			    	bos.write(buffer, 0, length);
			    }
	    	    System.out.println("finish");
			
		} catch (IOException e) {
			e.printStackTrace();
	}

}
}