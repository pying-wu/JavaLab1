package collection;


	import java.util.Comparator;

	import array.Employee;

	public class EmployeeCom implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
		
			Employee e1 = (Employee) o1;
			Employee e2 = (Employee) o2;
			if ( e1.getSalary() > e2.getSalary()) {
				return -1;
			}else if ( e1.getSalary() < e2.getSalary()) {
				return 1;
			}else {
				////相等情況,就commission排
				//if ( e1.getCommission() )..e1.
			}
			return 0;
		}

	}