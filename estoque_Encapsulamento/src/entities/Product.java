package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	
	
	public double setPrice(double price) {
		this.price= price;
		return price;
	}
	
	
	
	

	public Product() {
		// Se quiser posso continuar utilizando o construtor simples, o padr�o
	}
	
	
	
	/* Esse product � o construtor customizado, ele vai ser chamado ap�s a leitura dos dados
	 * no Program.java - Aqui � utilizado pra previnir de iniciar uma inst�ncia vazia
	 */
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	/*Sobrecarga,ele tem o mesmo nome do de cima, mas se quiser posso passar somente dois par�metros
	 * e o terceiro iniciar com 0
	 *caso for usar essa sobrecarga remover a entrada do int quantity no c�digo
	 */
	 
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		quantity = 0; // opcional porque as vari�veis j� iniciam 0 por padr�o
	}	

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

		this.quantity -= quantity;
	}

	public String toString() {

		return "Product Data: " 
		+ name 
		+ " , $" 
		+ String.format("%.2f", price) 
		+ ", " 
		+ quantity 
		+ " units"
		+ ", Total: $" + String.format("%.2f", totalValueInStock());

	}

}
