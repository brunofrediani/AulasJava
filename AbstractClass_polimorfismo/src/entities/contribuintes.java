package entities;

public abstract class contribuintes {
	// tem que ser abstract por conter um m�tido abstract


	private String name;
	private Double rendaAnual;
	
	
	public contribuintes(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double impostos();
// abstrato pra reutilizar nas subclasses; � abstract porque os calculos s�o diferentes 
	//para cada subclasse
}
