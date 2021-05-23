package Exam.e4;

public class Test {


	public static void main(String[] args) {

		Employee emp = new Employee(9457, "KFC", 12000);
		System.out.println("員編:"+emp.getEmpno()+", 名字:"+emp.getName()+", 薪水:"+emp.getSalary());
		
		Manager mng = new Manager(9457, "Mcd", 13000, 666);
	    System.out.println("員編:"+mng.getEmpno()+", 名字:"+mng.getName()+", 經理薪水:"+mng.getSalary());
		
	}

}
