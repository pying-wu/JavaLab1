package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		try ( FileInputStream fis = new FileInputStream("D:\\Java\\io_1.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				) { //binary,二進位
			System.out.println("available="+bis.available()); //file.length()
			int data = bis.read(); //讀一個byte,-1表示讀完了
			char c = (char)data;
			System.out.println(c);
			System.out.println(data);
			System.out.println("available="+bis.available()); //file.length()
			//此處只能用英數字,中文不適用
			while ( (data = bis.read()) !=-1 ) {
				System.out.println( (char)data );
			}
			
			
		} catch (FileNotFoundException e) {   //檔案印錯了
			e.printStackTrace();
		} catch (IOException e) {   //讀的時候有問題
			e.printStackTrace();
//		}finally {
//			try {
//				if ( fis != null) {//FileNotFoundException發生時,fis會是空值null
//				fis.close();//保證最後一定要呼叫到
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			
		}
		
	}

}
