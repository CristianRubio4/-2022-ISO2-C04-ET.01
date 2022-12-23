package C04.C04_ISO2_ET01;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

	@Test
	public void anoBisiesto() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(22, 10, 2020);
		assertTrue(fecha.bisiesto(fecha.getAnio()));
	}

	@Test
	public void anoNoBisiesto() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(22, 9, 2015);
		assertFalse(fecha.bisiesto(fecha.getAnio()));

	}

	@Test(expected = NumeroFueraDeRangoException.class)
	public void diaNoValido() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(-1, 3, 2016);
		assertFalse(fecha.bisiesto(fecha.getDia()));
	}

	@Test(expected = NumeroFueraDeRangoException.class)
	public void mesNoValido() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(1, -12, 2012);
		assertFalse(fecha.bisiesto(fecha.getMes()));

	}

	@Test(expected = NumeroFueraDeRangoException.class)
	public void anoNoValido() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(1, 12, -1990);
		assertTrue(fecha.bisiesto(fecha.getAnio()));
	}

	@Test(expected = NumeroFueraDeRangoException.class)
	public void anoNegativo() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(21, 11, -1);
		assertFalse(fecha.bisiesto(fecha.getAnio()));
	}

	@Test
	public void limiteInferior() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(1, 1, 0);
		assertTrue(fecha.bisiesto(fecha.getAnio()));
	}

	@Test
	public void limiteSuperior() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(31, 12, 1);
		assertFalse(fecha.bisiesto(fecha.getAnio()));
	}

	@Test
	public void anoSuperior() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(15, 6, 1);
		assertFalse(fecha.bisiesto(fecha.getAnio()));
	}

	@Test
	public void diaSuperior() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(31, 6, 4);
		assertTrue(fecha.bisiesto(fecha.getAnio()));
	}

	@Test
	public void mesSuperior() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(21, 12, 559);
		assertFalse(fecha.bisiesto(fecha.getAnio()));
	}

	@Test
	public void getDia() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(21, 11, 2010);
		assertTrue(fecha.getDia() == 21);

	}

	@Test
	public void getMes() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(21, 4, 2010);
		assertTrue(fecha.getMes() == 4);

	}

	@Test(expected = NumeroFueraDeRangoException.class)
	public void setDia() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(21, 11, 43);
		fecha.setDia(-3);

	}

	@Test(expected = NumeroFueraDeRangoException.class)
	public void setMes() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(21, 11, 1992);
		fecha.setMes(-8);

	}

	@Test(expected = NumeroFueraDeRangoException.class)
	public void setAnio() throws NumeroFueraDeRangoException {
		Bisiesto fecha = new Bisiesto(21, 11, 334);
		fecha.setAnio(-5);

	}

}
