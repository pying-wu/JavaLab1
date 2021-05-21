package collection;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.Map.Entry;

public class TestHashMap {
    //Thread 多執行續
	public static void main(String[] args) {

		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("John", 2000);
		map.put("David", 1000);
		map.put("Tom", 5000);
		map.put("Tom", 2500);
		
		//map.containsKey("Tom");
		//map.containsValue("Tom");
		
		System.out.println("Tom's 薪水="+ map.get("Tom"));
		
		Set<String> keySet = map.keySet();//alt+shift+l, Tom, David, John
		for( String key : keySet ) {
			System.out.println(key+ " = "+map.get(key));
		}
		//EntrySet
		Set< Entry<String, Integer>>  entrySet = map.entrySet();
		int sum = 0;
		for( Entry<String, Integer> entry : entrySet) { //java.util.Map.Entry
			//System.out.println(e.toString());//...
			//Entry entry =  (Entry) e;
			//Object value = entry.getValue(); //alt+shift+l,Integer
			sum = sum + entry.getValue();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		System.out.println("總和="+sum);
		
		System.out.println("----forEach------");
		BiConsumer<String, Integer> consumer = ( key, value ) -> {
			System.out.println("key="+key+",value="+value);
		};
		map.forEach(TestHashMap::bbbbb);
		//Method Reference
		
	}
    public static void bbbbb(String key, Integer value) {
    	System.out.println("key="+key+",value="+value);
    }
	
}
