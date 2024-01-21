package C04.C04_ISO2_ET01;

public class NumeroFueraDeRangoException extends Exception {
	private String error;

	public NumeroFueraDeRangoException(String error) {
		this.error = error;
	}

}
