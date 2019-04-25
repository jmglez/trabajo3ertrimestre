package Trabajo;

public class Caballero extends Ejercito {
	private int IdUnidad = 006;
	private String Nombre = "Caballeria";
	private int Nšunidades = 60;
	private int Poder = 490;
	public int getIdUnidad() {
		return IdUnidad;
	}
	public void setIdUnidad(int idUnidad) {
		IdUnidad = idUnidad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getNšunidades() {
		return Nšunidades;
	}
	public void setNšunidades(int nšunidades) {
		Nšunidades = nšunidades;
	}
	public int getPoder() {
		return Poder;
	}
	public void setPoder(int poder) {
		Poder = poder;
	}
	@Override
	public String toString() {
		return "Caballero [IdUnidad=" + IdUnidad + ", Nombre=" + Nombre + ", Nšunidades=" + Nšunidades + ", Poder="
				+ Poder + "]";
	}
	public Caballero() {
		super();
	}
	public Caballero(int idUnidad, String nombre, int nšunidades, int poder) {
		super();
		IdUnidad = idUnidad;
		Nombre = nombre;
		Nšunidades = nšunidades;
		Poder = poder;
	}
	
}
