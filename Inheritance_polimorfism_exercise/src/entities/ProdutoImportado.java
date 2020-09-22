package entities;

public class ProdutoImportado extends Produto {

	private Double taxaAlfandega;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double pre�o, Double taxaAlfandega) {
		super(nome, pre�o);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double precoTotal() {
		return getPre�o() + taxaAlfandega;
	}

	@Override
	public String etiqueta() {
		return getNome() 
				+ " $" 
				+ precoTotal()
				+ " (Taxa de importa��o: " 
				+  getTaxaAlfandega()
				+")";
	}

}
