package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	static Calculadora calc1,calc2 ;
	@BeforeEach
	
	static void CrearCalculadora () {
		calc1 = new Calculadora(30,10);
		calc1 = new Calculadora(10,30);
	}
	
	@AfterEach
	static void borrarCalculadora() {
		calc1 =null;
	}

	@Test
	void testResta1() {
		
		Calculadora calc1=new Calculadora(30,10);
		int resul=calc1.resta();
		assertEquals(20, resul,"No coinciden los resultados");
		//fail("Not yet implemented");
	}

	@Test
	void testResta_2() {
		
		Calculadora calc2=new Calculadora(10,30);
		int resul=calc2.resta();
		assertEquals(20, resul,"No coinciden los resultados");
		//fail("Not yet implemented");
	}
	
	@Test
	void testResta2_2() {
		Calculadora calc1 = new Calculadora(30, 10);
		boolean resultado = calc1.resta2();
		assertTrue(resultado);
	}
	
	@Test
	void testDivide() {
		Calculadora calc1 = new Calculadora(30, 10);
		int resultado = calc1.divide();
		assertEquals(2, resultado, "No coinciden los resultados");
	}

	@Test
	void testDivide2_1() {
		Calculadora calc1 = new Calculadora(30,10);
		Integer resultado = calc1.divide();
		assertNull(resultado);


}
}