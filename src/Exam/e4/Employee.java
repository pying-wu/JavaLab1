package Exam.e4;

public class Employee {
	

	private int empno; //員⼯編號
	private String name; //員⼯姓名　
	private long salary; //薪⽔
	
	public Employee(int empno, String name, long salary) {
	    
		this.empno=empno;
		this.name=name;
		this.salary=salary;
	}
	

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}
     
}

