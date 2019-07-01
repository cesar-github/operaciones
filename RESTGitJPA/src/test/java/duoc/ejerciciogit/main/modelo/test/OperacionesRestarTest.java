package duoc.ejerciciogit.main.modelo.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.ejerciciogit.main.modelo.OperacionesBasicas;

public class OperacionesRestarTest {
	private OperacionesBasicas opes;
	@Before
	public void setUp() throws Exception {
		this.opes = new OperacionesBasicas();
	}

	@Test
	public void cuando15menos5entonces10() {
		int resultado = this.opes.restar(15, 5);
		assertTrue("DEBERIA SER 10 PERO ES" +resultado, resultado ==10);
	}
	
	@Test
	public void cuandoBmayorqueAentonces0() {
		int resultado = this.opes.restar(0, 15);
		
		assertTrue("DEBERIA SER 0 PERO ES" +resultado, resultado ==0);
	}

	@Test
	public void cuandoMaxMenosMaxentonces0() {
		int resultado = this.opes.restar(Integer.MAX_VALUE,Integer.MAX_VALUE);
		
		assertTrue("DEBERIA SER 0 PERO ES" +resultado, resultado ==0);
	} 


}
