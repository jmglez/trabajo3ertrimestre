package Trabajo;


public class CrearUsuario  extends Usuario {//clase en desuso 
	private int idUsuario;
	private String Usuario;
	private String Contraseña;
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	@Override
	public String toString() {
		return "CrearUsuario [idUsuario=" + idUsuario + ", Usuario=" + Usuario + ", Contraseña=" + Contraseña + "]";
	}
	public CrearUsuario() {
			
	}
	public CrearUsuario(int idUsuario, String usuario, String contraseña) {
		super();
		this.idUsuario = idUsuario;
		Usuario = usuario;
		Contraseña = contraseña;
	}
	public static void crearusuario() {
		
	}
	
	
}
