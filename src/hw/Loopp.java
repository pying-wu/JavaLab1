package hw;

import java.util.Scanner;

public class Loopp {

	 public static void main(String []args){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt(); //總共可以跑的次數
	        for(int i=0;i<t;i++){
	            int a = in.nextInt(); //第二行開始第一數字
	            int b = in.nextInt(); //第二行開始第二數字
	            int n = in.nextInt(); //第二行開始第三數字
	            int c = a;
	            for(int j=0;j<n;j++){
	                c += Math.pow(2, j)*b;
	                System.out.printf("%s ",c);
	            }
	            System.out.println();
	        }
	        in.close();
	        
	        
	        
	    }
	}
