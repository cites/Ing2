package sysReclamo;

public class Usuario {
	private int id;
	private String nombre;
	private String apellido;
	private String email;
	private int telefono;
	private int dni;
	private String contrasenia;
	private Perfil perfil;
	private boolean activo;
	private UsuarioMock UsuarioDBA;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public boolean nuevo() {
		
		this.UsuarioDBA = new UsuarioMock();
		
		return this.UsuarioDBA.insert(this);
	
	}
	
	public boolean modificar() {
		
		this.UsuarioDBA = new UsuarioMock();
		
		return this.UsuarioDBA.update(this);
		
	}
	
	public boolean eliminar() {
		
		this.UsuarioDBA = new UsuarioMock();
		
		return this.UsuarioDBA.delete(this.id);
		
	}
	
	public boolean validarUsuario(String Email, String Password) {
		
		this.UsuarioDBA = new UsuarioMock();
		
		return this.UsuarioDBA.validarUsuario(Email, Password);
		
	}

}
