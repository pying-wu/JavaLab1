package Exam.e8;

import java.io.FileReader;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class ParseCSV {
	public static void main(String[] args) {
		/*
		 * 將exam/e8/Employee.csv Copy至c:\java 利用Commons csv library來處理csv檔案 網址如下
		 * https://commons.apache.org/proper/commons-csv/
		 * 1.下載commons-csv-1.8-bin.zip，解壓縮後將jar放至lib目錄 2.eclipse中設定library 3.參考官方的User
		 * Guide處理此csv 取得薪水的加總
		 * 
		 * 老師, 我java檔放在d槽呦! >_<
		 */
		
		final String[] FILE_HEADER = { "id", "name", "salary", "age" };
		final String FILE_NAME = "D:\\Java\\Employees.csv";
		try (Reader in = new FileReader(FILE_NAME)) {
		CSVFormat format = CSVFormat.DEFAULT.withHeader(FILE_HEADER).withSkipHeaderRecord();
			Iterable<CSVRecord> records = format.parse(in);
			int total1 = 0;
			for (CSVRecord record : records) {
				System.out.println(record.get("id")+' '+record.get("name")+' '+record.get("salary")+' '+record.get("age"));
				total1 += Integer.valueOf(record.get("salary").replaceAll("\"", "").replaceAll(",", ""));
			}
			System.out.println("薪水加總:"+total1+"元");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
