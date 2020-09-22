package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class produtoUsado extends Produto {
	
	
private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dtFabricacao;

	public produtoUsado() {
		super();
	}

	public produtoUsado(String nome, Double pre�o, Date dtFabricacao) {
		super(nome, pre�o);
		this.dtFabricacao = dtFabricacao;
	}

	@Override
	public String etiqueta() {
		return getNome() 
				+ " (usado): $"
				+ String.format("%.2f",getPre�o()) 
				+ " (Data de fabrica��o: " 
				+ sdf.format(dtFabricacao) + ")";

	}	
}
