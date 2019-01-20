import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;


@RunWith (Parameterized.class)

public class LlenadoDeposito {

	private double capacidad;
	private double nivel;
	private double echado;
	private double queda;
	
	public LlenadoDeposito(double c, double n, double e, double q) {
		
		capacidad = c;
		nivel = n;
		echado = e;
		queda = q;
		
	}
	
	@Parameters
	public static Collection<Object[]> datos(){
		return Arrays.asList(new Object[][] {
			{40,30,10,40},{40,0,2,2},{40,20,-2,18},{40,0,0,0},{40,15,0,15}
		});	
	}
	
	@Test
	public void test_consumir() {
		DepositoCombustible deposito = new DepositoCombustible(capacidad,nivel);
		deposito.fill(echado);;
		assertEquals(queda,deposito.getDepositoNivel(),0);
	}

}