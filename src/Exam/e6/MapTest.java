package Exam.e6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapTest {
    public static void main(String[] args) {

         People p1 = new People("001",21);
         People p2 = new People("002",33);
         People p3 = new People("003",41);
         //實作1:請實作一個泛型的Map中的key值為people的id，value為people物件，將上述三個people放入Map中
         Map<String,People> map = new HashMap<>();
         map.put("001",p1);
         map.put("002",p2);
         map.put("003",p3);
         

         //實作2:請用for迴圈或者iterator，計算Map中三人的平均年齡，取到小數以下第一位
         Set< Entry<String, People>>  entrySet = map.entrySet();
         int total = 0;
         int i =0; //人數
         for( Entry<String, People> entry : entrySet) {
        	total += entry.getValue().getAge();
        	i++;
         }
         double avg = (double)total / i;
         System.out.printf("平均年齡:%.1f",avg);
    }
}
