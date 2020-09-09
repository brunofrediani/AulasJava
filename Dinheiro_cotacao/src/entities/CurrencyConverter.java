package entities;

public class CurrencyConverter {

	public static double IOF = 0.06;

	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	}

	/* C�digo exemplificando a diferen�a de static e n�o static
	 * private int tamanho; //private static int conta = 0; //IMPRIME A CONTAGEM DE
	 * 4 VALORES private int conta = 0; //IMPRIME A CONTAGEM DE 1 VALOR
	 * 
	 * public CurrencyConverter(){ conta++; System.out.println("Valor = "+conta); }
	 * 
	 * public static void main(String[] args) { CurrencyConverter c = new
	 * CurrencyConverter();
	 * 
	 * CurrencyConverter dois = new CurrencyConverter(); CurrencyConverter tres =
	 * new CurrencyConverter(); CurrencyConverter quatro = new CurrencyConverter();
	 * }
	 */
}