package exception;

public class TestException {

	public static void main(String[] args) {

		try {
			
		int a = 1;
		int c = 1;
		//System.out.println("c="+ c--);
		
		int b = a / c;
	   System.out.println("b="+b);
	   
	   int[] x = {};
	   System.out.println(x[0]);
	   //RuntimeException子類別,是不需處理的
		
		}catch(ArithmeticException ex) {  //攔錯誤的語法
			System.out.println("程式除到0");
			ex.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException ex) {
			//System.out.println("程式除到0");
			ex.printStackTrace();
		}catch(Exception ex) {
			//System.out.println("程式除到0");
			ex.printStackTrace();
		}finally {
			System.out.println("finally 一定會被執行的區塊");
		}
		System.out.println("finish");
	}

}
