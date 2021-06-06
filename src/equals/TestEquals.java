package equals;

public class TestEquals {

	public static void main(String[] args) {

		Employee e1 = new Employee("001");//0800
		Employee e2 = new Employee("001");//0900
		
		System.out.println(e1 == e2);//false
		System.out.println(e1.equals(e1));//f3
//		Car c = new Car("Prius", 'R');
//		System.out.println(e1.equals(c));
		
		e1 = null;
		System.gc();//強制系統執行GC
		
		System.out.println(e2);
		System.out.println(e2.toString());
	}

}
