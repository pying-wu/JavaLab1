package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
        //utility 工具
		Set<String> set = new LinkedHashSet<>();
		//Set set = new LinkedHashSet();//*Linked:紀錄加入順序
		set.add("Hello");
		boolean success = set.add("Hello");
		System.out.println("加第二次有沒有成功:"+success);
		System.out.println("size:"+set.size());
		set.add("World");
		//set.add(3.0);
		System.out.println("size:"+set.size());
		
		//
		boolean contains = set.contains("World");
		System.out.println("有沒有World:"+contains);
		
		for( String item : set ) {
			System.out.println(item);
			
		}
		//Iterator
		
		
	}

}
