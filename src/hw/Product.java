package hw;

public class Product {

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    //商品名稱
    private String name;
    //商品價錢
    private int price;
    
	public void setName(String name) {
		this.name = name;
	}
	
    public String getName() {
        return name;
    }
    
	public void setPrice(int price) {
		this.price = price;
	}
    public int getPrice() {
        return price;
    }
	public String desc() {
		return String.format("名稱:%s,價錢:%d", name,price);
	}

}
