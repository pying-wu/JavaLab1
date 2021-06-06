package hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Lottery1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("請輸入不喜歡的數字");
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		int a = Integer.parseInt(number);
		String total = " ";
		for (int i =1; i<50 ; i++) {
			if(i==a) {
				continue;
			}
			else {
				list.add(i);
//				System.out.println("--輸入的數字無效，請重新輸入--");
//				break;
			}
		}
		System.out.println("您所輸入的數字為:"+a);
		System.out.println("可選的數字為以下:");
			for(int b:list) {
				String s = Integer.toString(b);
				total = total + s + " ";
				if(b%10 == 0) {
					System.out.printf("%s\n",total);
					total=" ";
				}
			}
			System.out.println(total);
		System.out.println("總共:"+list.size()+"種");
	}

}
