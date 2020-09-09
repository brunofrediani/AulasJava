package entities;

public class Product {
	
	
	
	public String name;
	public double price;
	public int quantity;
	
	
	public double totalValueInStock() {
		
	return price * quantity;
	}
public void addProducts(int quantity) {
	
	this.quantity += quantity;
	
	/*
	 * esse this � pra dizer que essa vari�vel quantity � a da classe product,
	 * enquanto a outra var quantity � a que vai receber o valor que formos inserir
	 */
}
public void removeProducts(int quantity) {
	
	this.quantity-=quantity;
}

public String toString(){
	
	return "Product Data: "
	+name
			+" , $"
			+String.format("%.2f",price)
			+", "
			+quantity
			+" units"
			+", Total: $"
			+String.format("%.2f", totalValueInStock());
			
	
}

	
}
