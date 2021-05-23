package Exam.e9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortList2 {
	public static void main(String[] args) {
		Employee e1 = new Employee("001", 10000, 300);
		Employee e2 = new Employee("002", 10000, 200);
		Employee e3 = new Employee("003", 20000, 200);
		Employee e4 = new Employee("004", 30000, 200);

		List<Employee> list = Arrays.asList(e1, e2, e3, e4);
		// 請利用List中的sort方法重新排序e1..e4，排序時薪水(salary)大的排前面，如果薪水一樣則commission大的排前面

//		Set<Employee> set = new TreeSet<Employee>(new Comparator<Employee>() {
			Employee[] arrayEmployee = (Employee[]) Employee.toArray();
	        Arrays.sort(arrayEmployee, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
//				if (o1.getSalary() > o2.getSalary()) {
//					return -1;
//				} else if (o1.getSalary() == o2.getSalary()) {
//					if (o1.getCommission() > o2.getCommission()) {
//						return -1;
//					} else {
//						return 1;
//					}
//				} else {
//					return 1;
//				}
				if (o1.getSalary() > o2.getSalary()
						|| o1.getSalary() == o2.getSalary() && o1.getCommission() > o2.getCommission()) {
					return -1;
				} else {
					return  1;
				}
			};
		});
		
//		set.addAll(list);
//		for (Employee listEmployee : set) {
//			System.out.printf("員工編號:%s,薪水:%s,傭金:%s%n", listEmployee.getId(), listEmployee.getSalary(),
//					listEmployee.getCommission());
//		}
	      
	        System.out.println(Employee.toArray());
	
	}
}
