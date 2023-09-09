package package_1;

public class ExcepTxtVacio extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ExcepTxtVacio() {
		
	}

	@Override
	public String getMessage() {

		return "Error, campo sin completar";
	}
	
}
