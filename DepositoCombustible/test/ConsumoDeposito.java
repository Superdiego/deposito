import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;


@RunWith (Parameterized.class)

public class ConsumoDeposito {

	private double capacidad;
	private double nivel;
	private double gastado;
	private double queda;
	
	public ConsumoDeposito(double c, double n, double g, double q) {
		
		capacidad = c;
		nivel = n;
		gastado = g;
		queda = q;
		
	}
	
	@Parameters
	public static Collection<Object[]> datos(){
		return Arrays.asList(new Object[][] {
			{40,30,10,20},{40,40,2,38},{40,20,-4,24},{40,40,35,5},{40,15,0,15},{40,0,0,0}
		});	
	}
	
	@Test
	public void test_consumir() {
		DepositoCombustible deposito = new DepositoCombustible(capacidad,nivel);
		deposito.consumir(gastado);
		assertEquals(queda,deposito.getDepositoNivel(),0);
	}

}
