package exception;

public class Lab4 {

	public static void main(String[] args) {

		int j = 1;
		try {
			int a = (j = 2) / hello()  ;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(j);
		}
	}

	public static int hello() throws Exception {
		throw new Exception("exception");
	}
	
}	
