package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.w3c.dom.css.Counter;

public class ReadFileHW {

	public static void main(String[] args) {
		
       // File file = new File();
		
		
		try ( FileInputStream fis = new FileInputStream("D:\\Java\\Employees.csv");
				InputStreamReader isr = new InputStreamReader(fis,"UTF8");
				BufferedReader br = new BufferedReader(isr);
				
		) {
			String line;
			while ( (line = br.readLine()) !=null) {
				System.out.println(line);
				
				String[] column = line.split(",");
				//System.out.printf(columns[2]);
				String salary = column[2];
//				if ( !isDigital(c)) {
//					
//				}
			}
	
			
		} catch (FileNotFoundException e) {   //檔案印錯了
			e.printStackTrace();
		} catch (IOException e) {   //讀的時候有問題
			e.printStackTrace();

			
		}
		System.out.println();
		
	}

}
