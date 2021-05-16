package array;

import java.util.Iterator;

public class TestEmployee {

	public static void main(String[] args) {

		Employee[] emps = new Employee[2];
		/*
		Employee emp1 = new Employee();
		emp1.name = "Viva";
		emp1.empno = 1;
		emps[0] = emp1;
		*/
		emps[0] = new Employee();
		emps[0].name = "Viva";
		emps[0].empno = 1;
			
		Employee emp2 = new Employee();
		emp2.name = "Kiki";
		emp2.empno = 2;
		emps[1] = emp2;
		System.out.println(emps[0].name);
		System.out.println("-----");
		                  //0 , 1
		for(int i =0; i < emps.length ; i++ ) {
			System.out.println(emps[i].name);
		}
		
		
		
	}

}
