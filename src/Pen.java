
public abstract class Pen {
	
	protected String brand;
	protected double price;
	
	public Pen() {
		super();
	}
	
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public Pen(String brand) {
		this(brand, -1);
	}
	
	public Pen(double price) {
		this("unknow", price);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void write();
	
	

}
