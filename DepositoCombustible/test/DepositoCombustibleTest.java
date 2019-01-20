import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

//Como los primitivos "double" no trabajan facilmente con la expresión "asserEquals", contemplo un par de formas de solucionarlo.	
	
	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tanque01 = new DepositoCombustible(20,10);		
		assertEquals(10,tanque01.getDepositoNivel(),0);
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible tanque01 = new DepositoCombustible(20,10);
		int maximo = (int) tanque01.getDepositoMax();
		assertEquals(20,maximo);
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible tanque01 = new DepositoCombustible(20,0);
		boolean vacio = tanque01.estaVacio();
		assertEquals(true,vacio);
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible tanque01 = new DepositoCombustible(20,10);
		boolean medio = tanque01.estaLleno();
		assertEquals(false,medio);
	}

	@Test
	public void testFill() {
		DepositoCombustible tanque01 = new DepositoCombustible (20,10);
		tanque01.fill(8);
		assertEquals(18,tanque01.getDepositoNivel(),0);
		
	}

	@Test
	public void testConsumir() {
		DepositoCombustible tanque01 = new DepositoCombustible (20,10);
		tanque01.consumir(8);
		assertEquals(2,tanque01.getDepositoNivel(),0);
	}

}
