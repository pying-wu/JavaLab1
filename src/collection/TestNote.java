package collection;

import java.util.Date;

import interFace.Food;
import interFace.Product;

public class TestNote {

	public static void main(String[] args) {
		
		NoteInt a = new NoteInt(10);
		System.out.println(a.getContent());
		
		NoteString b = new NoteString("HelloWorld");
		System.out.println(b.getContent());
		
		Date date = Product.getDate(2021, 5, 14);
		Food food = new Food("肉鬆",200,  date  );

		Note<Double> doubleNote = new Note<>(3.0);
		System.out.println(doubleNote.getContent());
		
		//Note<String> stringNote = new Note<String>("ac");
		
	}

}
