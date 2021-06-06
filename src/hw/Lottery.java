package hw;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

//		int n = 0;
//		int n10, n1;
//		int amount = 0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("阿文...請輸入你討厭哪個數字？");
//		while (sc.hasNextLine()) {// hasNextLine()方法判斷當前是否有輸入，當鍵盤有輸入後執行迴圈
//			if (sc.hasNextInt()) {// 判斷輸入的值是否為整數型別，當為整數型別時執行迴圈
//				n = sc.nextInt();
//				System.out.println("n:" + n);
//				System.out.println("你輸入的數字為：" + n);
//
//			} else {
//				System.out.println("請輸入數字哦！");
//				sc.nextLine();
//				continue;
//			}
//			System.out.println("剩下的數字有:");
//			for (n10 = 0; n10 <= 4; n10++) {
//				if (n10 == n) {
//					continue;
//				}
//				for (n1 = 0; n1 <= 9; n1++) {
//					if (n1 == n) {
//						continue;
//					}
//					if (n1 != 0 && n10 == 0) {
//						System.out.print(n1 + " ");
//						amount = amount + 1;
//					} else if (n10 > 0) {
//						System.out.print(n10 + "" + n1 + " ");
//						amount = amount + 1;
//					}
//
//				}
//			}
//
//			System.out.println();
////		System.out.println("總共個數："+ amount);
//
//			int r;
//			String[] all = new String[amount];
//			int i = 0;
//			for (n10 = 0; n10 <= 4; n10++) {
//				if (n10 == n) {
//					continue;
//				}
//				for (n1 = 0; n1 <= 9; n1++) {
//					if (n1 == n) {
//						continue;
//					}
//					if (n1 != 0 && n10 == 0) {
//						all[i] = n1 + "";
//						i = i + 1;
//					} else if (n10 > 0) {
//						all[i] = n10 + "" + n1;
//						i = i + 1;
//					}
//				}
//			}
//			System.out.println("亂數印出6個不重覆號碼：");
//			for (int j = 0; j < 6; j++) {
//				r = (int) (Math.random() * 35);
////				if (all[r] != "0") {
//					System.out.print(all[r] + " ");
////					all[r] = "0";
////				}
//			}
//		}

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？");
		while (sc.hasNextLine()) {

			if (sc.hasNextInt()) {// 判斷輸入的值是否為整數型別，當為整數型別時執行迴圈
				n = sc.nextInt();
				System.out.println("你輸入的數字為：" + n);

				int r;
				int c = 0;
				while (c < 6) {
					r = (int) (Math.random() * 49) + 1;
					if (String.valueOf(r).indexOf(String.valueOf(n)) > -1) {
						continue;
					}
					System.out.print(r + " ");
					c++; 
				}
				System.out.println();
			} else {
				String str = sc.next();
				if ("stop".equals(str)) {
					sc.close();
					break;
				}
				System.out.println(str + "不為數字，請輸入數字哦！");
				continue;
			}
//			double a =99.99 ;
//			int a1 = (int) a;
//			System.out.println(a1);
			}
	}
}
