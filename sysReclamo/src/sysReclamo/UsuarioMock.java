package sysReclamo;

import java.util.ArrayList;
import java.util.List;

public class UsuarioMock {
	
	public Usuario find(int idusuario) {
		Usuario usuario = null;

		return usuario;
	}

	public boolean insert(Usuario nuevoUsuario) {
		//retorna verdadero simulando que se inserto el usuario
		return true;
	}

	public boolean delete(int id_usuario_a_eliminar) {
		return true;
	}

	public List<Usuario> readAll() {

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario u1 = new Usuario();
		u1.setId(1);
		u1.setNombre("DANIEL");
		u1.setApellido("QUIROGA");
		u1.setDni(37456324);
		u1.setPerfil(Perfil.ADMINISTRADOR);
		u1.setActivo(true);
		usuarios.add(u1);
		
		Usuario u2 = new Usuario();
		u2.setId(2);
		u2.setNombre("RICARDO");
		u2.setApellido("INSAURRALDE");
		u2.setDni(56384324);
		u2.setPerfil(Perfil.CUIDADANO);
		u2.setActivo(true);
		usuarios.add(u2);
		
		Usuario u3 = new Usuario();
		u3.setId(3);
		u3.setNombre("LUCIANO");
		u3.setApellido("MILICH");
		u3.setDni(32384324);
		u3.setPerfil(Perfil.COORDINADOR);
		u3.setActivo(true);
		usuarios.add(u3);
		
		Usuario u4 = new Usuario();
		u4.setId(4);
		u4.setNombre("ARIEL");
		u4.setApellido("SAUL");
		u4.setDni(23484344);
		u4.setPerfil(Perfil.CUIDADANO);
		u4.setActivo(true);
		usuarios.add(u4);
		
		return usuarios;
	}

	public boolean update(Usuario usuario_a_modificar) {
		return true;
	}

	public boolean validarUsuario(String email, String password) {
		
		return true;
	}
}
