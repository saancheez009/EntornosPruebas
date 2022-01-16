package operaciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calc=new Calculadora(20,10);
		int resul=calc.suma();
		assertEquals(30, resul);
	}

	@Test
	void testResta() {
		Calculadora calc=new Calculadora(20,10);
		int resul=calc.resta();
		assertEquals(10, resul);
	}

	@Test
	void testMultiplica() {
		Calculadora calc=new Calculadora(20,50);
		int resul=calc.multiplica();
		assertEquals("Fallo en la multiplicación", 200, resul);
	}

	@Test
	void testDivide() {
		try {
			Calculadora calc=new Calculadora(20,0);
			int resul=calc.divide();
			fail("FALLO, debería haber lanzado la excepción");
		} catch (ArithmeticException e){
			
		}
	}
		
}
