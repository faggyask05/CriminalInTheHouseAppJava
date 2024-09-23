package criminalInTheHouse;

public class WrongValueException extends Exception {
	
	private Object error = " ";

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}

	public WrongValueException(Object error) {
		setError(error);
	}

	public void errorMessage() {
		System.err.println("Undifinated Menu Value the caracter what you type it :   " + getError()+" not correct!!!");
	}
	
}
