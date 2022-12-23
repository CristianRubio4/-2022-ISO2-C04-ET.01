package C04._C04_ISO2_ET01_;

public class Bisiesto {

	private int dia;
	private int mes;
	private int anio;

	public Bisiesto(int dia, int mes, int anio) 
			throws NumeroFueraDeRangoException {
		if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 0)
			throw new
			NumeroFueraDeRangoException("Error al introducir los valores");
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia)
			throws NumeroFueraDeRangoException {
		if (dia < 1 || dia > 31)
			throw new 
			NumeroFueraDeRangoException("Error al introducir los valores");

		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) 
			throws NumeroFueraDeRangoException {
		if (mes < 1 || mes > 12)
			throw new
			NumeroFueraDeRangoException("Error al introducir los valores");

		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio)
			throws NumeroFueraDeRangoException {
		if (anio < 0)
			throw new
			NumeroFueraDeRangoException("Error al introducir los valores");

		this.anio = anio;
	}

	public boolean bisiesto(int anio) 
			throws NumeroFueraDeRangoException {
		if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0))
			return true;

		return false;
	}

}
