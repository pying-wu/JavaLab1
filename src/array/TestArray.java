package array;

public class TestArray {

	public static void main(String[] args) {
		//int, double float char boolean
		
//		int [] ages = new int[10];
		int [] ages = { 1,2,3 };
		
		for( int a : ages ) {
			    System.out.println(a);
		}
		
		System.out.println(ages[1]);
		System.out.println("length="+ages.length);
//		System.out.println(ages[9]);
		System.out.println("finish");
		ages =null;
		

	}

}
