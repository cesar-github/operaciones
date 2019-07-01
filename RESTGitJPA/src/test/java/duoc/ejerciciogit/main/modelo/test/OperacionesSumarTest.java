package duoc.ejerciciogit.main.modelo.test;

import static org.junit.Assert.*;

import javax.validation.constraints.AssertTrue;

import org.junit.Before;
import org.junit.Test;

import duoc.ejerciciogit.main.modelo.OperacionesBasicas;

public class OperacionesSumarTest {
	private OperacionesBasicas opes;

	@Before
	public void setUp() throws Exception {
		this.opes = new OperacionesBasicas(); 
	}

	@Test
	public void cuandoA15masB20entonces35() {
		int resultado = this.opes.sumar(15, 20);
		//assertTrue(resultado ==35);
		assertEquals(35, resultado);
	}
	
	@Test
	public void cuandoA0entonces0() {
		int resultado = this.opes.sumar(0, 20);
		//assertTrue(resultado ==35);
		assertEquals(0, resultado);
	}
	
	@Test
	public void cuandoB0entonces0() {
		int resultado = this.opes.sumar(15, 0);
		//assertTrue(resultado ==35);
		assertEquals(0, resultado);
	}
	
	@Test
	public void cuandoMaxMaxMaxentoncesMenus2() {
		int resultado = this.opes.sumar(Integer.MAX_VALUE, Integer.MAX_VALUE);
		//assertTrue(resultado ==35);
		assertEquals(-2, resultado);
	}

}
