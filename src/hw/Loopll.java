package hw;

import java.util.Scanner;

public class Loopll {

	public static void main(String[] args) {
		String [] solution = new String[2000] ;
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int input_number = scan1.nextInt();
		int j = 0;
		for(int i = 0 ; i < input_number ; i++ ) {
			int data_input_1 = scan2.nextInt();
			int	data_input_2 = scan2.nextInt();
			int data_input_3 = scan2.nextInt();
			solution[j] = caculation(data_input_1, data_input_2, data_input_3);
			j++;
		}
		String result = "";
		for(int k = 0 ;k < input_number;k++) {
			result += solution[k];
			result += "\n";
		}
		scan1.close();
		scan2.close();
		System.out.println(result);
	}
//		double pow = Math.pow(2, 3); //math.pow(基底,次方)		
	public static String caculation(int a,int b,int c) {
		int count = 0;
		int first = 0;
		double result = 0;
		String total = "";
		for(int i = 0;i < c ; i++ ) {
			if(first == 0) {
				result = result + (a + Math.pow(2,count)*b);
				total += Integer.toString((int)result)+" ";
				first++;
				count++;
//				System.out.println(result);
			}else {
				result = result + (Math.pow(2,count)*b); 
				count++;
				total += Integer.toString((int)result)+" ";
//				System.out.println((int)result);
			}
		}		
		return total;
		
	}
}
