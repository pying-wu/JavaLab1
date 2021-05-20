package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {

		try( FileOutputStream fos = new FileOutputStream("D:\\Java\\io_2.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				) {
			
			String content = "中文abc";
			bos.write(content.getBytes());
			System.out.println("finish");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
