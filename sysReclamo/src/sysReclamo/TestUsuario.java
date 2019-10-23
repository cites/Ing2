package sysReclamo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUsuario {

	@Test
	public void testCrearUsuario()
	{
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		
		u1.nuevo(u2);
		assertEquals(u1,u2);
	}
}