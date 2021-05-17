package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.ZipException;

public class TestCheckException {

	public static void main(String[] args) throws IOException {
		//ctrl+1 : fix
        
		FileReader fr = new FileReader("D:\\Java\\JavaWorkspace\\JavaLab\\src\\HelloWorld.java.");
		//FileReader fr = new FileReader("c:/java/aaa.txt");
			
		
		
		System.out.println("done");
		//啟動JAVA的執行環境:JVM 會印出錯誤給你看	
		
	}

}
