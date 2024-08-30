
public class Pencil extends Pen{
	
	public Pencil(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public Pencil(String brand) {
		this(brand, -1);
	}
	
	public Pencil(double price) {
		this("unknow", price);
	}

	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
		
	}

	@Override
	public double getPrice() {
		return price * 0.8;
	}
	
	
	
	

}
