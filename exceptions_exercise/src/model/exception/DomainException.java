package model.exception;

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
	
	
	/*
	 * RuntimeException = n�o exige tratamento do erro
	 * Exception = Exige que o erro seja tratado
	 */
	
	
}
