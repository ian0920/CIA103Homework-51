package homework6;

public class InkBrush extends Pen{
	
	public InkBrush(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public InkBrush(String brand) {
		this(brand, -1);
	}
	
	public InkBrush(double price) {
		this("unknow", price);
	}
	
	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
		
	}
	
	@Override
	public double getPrice() {
		return price * 0.9;
	}

}
