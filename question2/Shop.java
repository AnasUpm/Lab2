
public class Shop {
	
	private String name;
	private double price;
	private int qty;
	private Fan product;
	
	
	Shop(){
		name = "Unnamed";
		price = 0;
		qty = 0;
		product = new Fan();
	}
	
	Shop( String name, double price, int qty){
		this.name=name;
		this.price=price;
		this.qty=qty;
		product = new Fan();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Fan getProduct() {
		return product;
	}

	
	public String toString() {
		return "Name of Fan : "+name+"\nPrice(RM) : "+price+"\nQuantity : "+qty+"\n\n  Fan Properties : \n"+product.toString();
	}
}
