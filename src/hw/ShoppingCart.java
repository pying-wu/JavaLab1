package hw;


import java.util.ArrayList;
import java.util.List;




public class ShoppingCart {
    public static void main(String[] args) {

        //實作1.加入二台Notebook("Asus",30000),Notebook("Acer",20000),Food("Cookie",200)到shoppingList中
        List<Product> shoppingList = new ArrayList<Product>();
        Notebook nb = new Notebook("Asus", 30000);
        Notebook nb1 = new Notebook("Acer", 200);
        Food fd = new Food("Cookie", 200);
        Product[] products = new Product[] {nb, nb1, fd};
        Product[] productss = new Product[] {nb, nb1};
		
		System.out.println(nb.desc());
		System.out.println(nb1.desc());
		System.out.println(fd.desc());
		buy(products);
        
    }
        //實作2.利用for迴圈，計算shoppingList中的總金額,並印在Console中
		public static void buy(Product[] shoppingList ) {
		int sum = 0;
        for ( Product product : shoppingList ) {
        	 sum = sum + product.getPrice();
        }
        System.out.println("總金額:"+ sum);
		}
        	

        //實作3.利用for迴圈，計算shoppingList中是Notebook型態的總金額,並印在Console中
		public static void buy1(Product[] shoppingList ) {
			
			int sum = 0;
	        for ( Product product : shoppingList ) {
	        	sum = sum + product.getPrice();
	        }
	        System.out.println("總金額:"+ sum);
			}
}
