package primapackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PRIMAv3Test {
	@Test
	public void prima_c1() {
		PRIMAv3 p1 = new PRIMAv3(95,10);
		int valor_esperado  = -1;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0) ;

			
	}
	
	@Test
	public void prima_c2() {
		PRIMAv3 p1 = new PRIMAv3(20,30);
		int valor_esperado  = 1350;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0);

			
	}
 
	@Test
	public void prima_c3() {
		PRIMAv3 p1 = new PRIMAv3(20,28);
		int valor_esperado  = 1400;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0) ;

			
	}
	
	@Test
	public void prima_c4() {
		PRIMAv3 p1 = new PRIMAv3(26,30);
		int valor_esperado  = 850;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0) ;

			
	}
	
	@Test
	public void prima_c5() {
		PRIMAv3 p1 = new PRIMAv3(30,10);
		int valor_esperado  = 900;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0) ;

			
	}
	@Test
	public void prima_c6() {
		PRIMAv3 p1 = new PRIMAv3(40,30);
		int valor_esperado  = 400;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0) ;

			
	}
	@Test
	public void prima_c7() {
		PRIMAv3 p1 = new PRIMAv3(40,10);
		int valor_esperado  = 500;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0) ;

			
	}
	@Test
	public void prima_c8() {
		PRIMAv3 p1 = new PRIMAv3(50,30);
		int valor_esperado  = 250;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0) ;

			
	}
	@Test
	public void prima_c9() {
		PRIMAv3 p1 = new PRIMAv3(50,10);
		int valor_esperado  = 400;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0) ;

			
	}
	@Test
	public void prima_c10() {
		PRIMAv3 p1 = new PRIMAv3(65,30);
		int valor_esperado  = 550;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0) ;

			
	}
	@Test
	public void prima_c11() {
		PRIMAv3 p1 = new PRIMAv3(65,10);
		int valor_esperado  = 750;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0) ;

			
	}

	@Test
	public void prima_c12() {
		PRIMAv3 p1 = new PRIMAv3(10,12);
		int valor_esperado  = -1;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0) ;

			
	}
	@Test
	public void prima_c13() {
		PRIMAv3 p1 = new PRIMAv3(30,47);
		int valor_esperado  = -1;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0) ;

			
	}
	
	@Test
	public void prima_c14() {
		PRIMAv3 p1 = new PRIMAv3(30,-1);
		int valor_esperado  = -1;
		int resultado = p1.calcula_prima();
		assertEquals(valor_esperado, resultado,0) ;

			
	}

}
