package io;

import java.io.File;
//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TestFile {

	public static void main(String[] args) {
        
		Set<File> fileSet = new TreeSet<>( new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {
				if ( o1.length() < o2.length() ) {
					return -1;
				}else if ( o1.length() > o2.length() ) {
						return 1;
					
				}
//				else  {
//				return 1;		
//		}
				
				return 0;
			}
		}
		);
		File dir = new File("D:\\Java");
		File[] list = dir.listFiles();
		int counter = 0;
		long size = 0;
		for( File f    : list   ) {
			fileSet.add(f);
			System.out.println(f.getName()+", 目錄:"+f.isDirectory());
			long lastModified = f.lastModified(); //修改時間
			Date date = new Date(lastModified);
			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd a hh:mm Z");
			//DateFormat format = new SimpleDateFormat("yyyy/MM/dd a hh:mm"); 也可直接用父類別
			System.out.println(format.format(date));
			if ( !f.isDirectory() ) {
				counter ++;
				size += f.length();
				fileSet.add(f);
			}
			
			
		}
		System.out.println("檔案總數="+counter);
		System.out.println("檔案大小總和="+size+" bytes ");
		System.out.println("=================");
		for( File f : fileSet ) {
			System.out.println("名稱:"+f.getName()+",大小"+f.length());
		}
	}

}
