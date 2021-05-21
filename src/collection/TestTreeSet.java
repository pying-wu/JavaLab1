package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class TestTreeSet {

		
		public static void main(String[] args) {
		    //1.
			DescComparator comparator = new DescComparator();
			//2.anonymous class, TestTreeSet$1.class
			Comparator com = new Comparator() {
				public int compare(Object o1, Object o2) {

					Integer i1 = (Integer) o1;
					Integer i2 = (Integer) o2;
					if  ( i1 > i2) {
						return -1;
					}else if ( i1 < i2) {
						return 1;
					}	
					return 0; //相等情況,就隨便TreeSet排
				}

			};
			//lambda
			Comparator com1 = (Object o1, Object o2) -> {
				Integer i1 = (Integer) o1;
				Integer i2 = (Integer) o2;
				if  ( i1 > i2) {
					return -1;
				}else if ( i1 < i2) {
					return 1;
				}	
				return 0;			
		    };
		    Comparator com2 = (o1, o2) -> 1;
			
			
			Set set = new TreeSet((o1, o2) -> {
				Integer i1 = (Integer) o1;
				Integer i2 = (Integer) o2;
				if ( i1 > i2) {
					return -1;
				}else if ( i1 < i2) {
					return 1;
				}
				return 0;//相等情況,就隨便TreeSet排				
			});//預設是由小到大,自然排序
			
			
			
			set.add(new Integer(4));
			set.add(4);//autoboxing
			set.add(3);//autoboxing
			set.add(2);//autoboxing
			set.add(1);//autoboxing
			
			for( Object item : set) {
				System.out.println(item);
			}

		}


}
