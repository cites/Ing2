package sysReclamo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUsuario {

	@Test
	public void testCrearUsuario() {
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		
		assertEquals(u1.nuevo(),true);
		assertEquals(u2.nuevo(),true);
	}
	
	@Test
	public void testModificarUsuario() {
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		
		assertEquals(u1.modificar(),true);
		assertEquals(u2.modificar(),true);
	}
	
	@Test
	public void testEliminarUsuario() {
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		
		assertEquals(u1.eliminar(),true);
		assertEquals(u2.eliminar(),true);
	}
	
	@Test
	public void testValidarLogin() {
		Usuario u1 = new Usuario();
		
		assertEquals(u1.validarUsuario("ricardo@gmail.com","1234"),true);
		
		assertEquals(u1.validarUsuario("alfredo@gmail.com","3253"),true);
	}
	
}