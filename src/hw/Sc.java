package hw;

import java.util.Scanner;

public class Sc {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);  //構造Scanner類的物件scan，接收從控制檯輸入的資訊
	        System.out.println("請輸入你的姓名");
	        String name = scan.nextLine();//接收一個字串，可以加除Enter以為的所有符號，包括空格和Tab
	        System.out.println("請輸入你的ID");
	        String ID ;
	        while(scan.hasNextLine()) {// hasNextLine()方法判斷當前是否有輸入，當鍵盤有輸入後執行迴圈
	            if(scan.hasNextInt()) {// 判斷輸入的值是否為整數型別，當為整數型別時執行迴圈
	                ID = scan.nextLine();
	                System.out.println("你輸入的姓名為："+name);
	                System.out.println("你輸入的ID為："+ID);
	                break;
	            }else {
	                System.out.println("請輸入數字哦！");
	                ID = scan.nextLine();
	                continue;
	}
	        }            
	}
}
