package homework8;

import java.util.Iterator;
import java.util.Objects;

public class Train implements Comparable<Train> {
	
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train(int number, String type, String start, String dest, double price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	

	public int getNumber() {
		return number;
	}




	@Override
	public String toString() {
		
		return "%d %s %s %s %.2f".formatted(number, type, start, dest, price);
	}



	@Override
	public int compareTo(Train o) {
//		if (this.getNumber() < o.getNumber()) {
//			return 1;
//		} else if ( this.equals(o) ){
//			return 0;
//		}else {
//			return -1;
//		}
		
		return Integer.compare(this.number,o.number);
		
	}





	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
			}
		
		if (obj != null && this.getClass() == obj.getClass()) {
			Train t = (Train)obj;		
			if (this.price == t.price && this.type.equals(t.type) && this.start.equals(t.start) && this.dest.equals(t.dest) && this.price == t.price) {
				return true;
			}			
		} else {
			return false;
		}			
		return false;		
	}



	@Override
	public int hashCode() {
		int result = type != null ? type.hashCode() : 0 ;
		result = result *31 + number;
		return result;
	}




	
	
	






	
	
	

}
