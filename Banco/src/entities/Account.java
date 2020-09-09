package entities;

	public class Account {

		private int number;
		private String holder;
		private double balance;
		
		/* gerado somente getter para balance e number da conta. Esses parametr�s n�o devem ser acessados
		 * por motivos de seguran�a.Para que ningu�m altere o balance(saldo) .
		 */
		
		
		
		public Account(int number, String holder) {
			this.number = number;
			this.holder = holder;
		}

		public Account(int number, String holder, double initialDeposit) {
			this.number = number;
			this.holder = holder;
			deposit(initialDeposit);
			
	/* Aqui foi trocado o this.balance = balance, pelo initialDeposit.Utilizamos a opera��o ao inv�s
	 * de usar a vari�vel em si. d� mais seguran�a e caso mude a opera��o de deposito n�o vai ser 
	 * necess�rio mudar aqui
	 */
			
			
		}

		public int getNumber() {
			return number;
		}

		public String getHolder() {
			return holder;
		}

		public void setHolder(String holder) {
			this.holder = holder;
		}

		public double getBalance() {
			return balance;
		}

		public void deposit(double amount) {
			balance += amount;
		}
		
		public void withdraw(double amount) {
			balance -= amount + 5.0;
		}
		
		public String toString() {
			return "Account "
					+ number
					+ ", Holder: "
					+ holder
					+ ", Balance: $ "
					+ String.format("%.2f", balance);
		}
}