package operaciones;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calc = new Calculadora(10, 20);
		int resultado = calc.suma();
		assertEquals(30, resultado);
	}

	@Test
	void testResta() {
		fail("Not yet implemented");
	}

	@Test
	void testMultiplica() {
		fail("Not yet implemented");
	}

	@Test
	void testDivide() {
		fail("Not yet implemented");
	}

}
