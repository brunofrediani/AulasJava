package entities;

public class Produto {

	private String nome;
	private Double pre�o;

	public Produto() {
		super();
	}

	public Produto(String nome, Double pre�o) {
		super();
		this.nome = nome;
		this.pre�o = pre�o;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPre�o() {
		return pre�o;
	}

	public void setPre�o(Double pre�o) {
		this.pre�o = pre�o;
	}

	public String etiqueta() {
		return nome 
				+ " $" 
				+ String.format("%.2f", pre�o);

	}
	

}
