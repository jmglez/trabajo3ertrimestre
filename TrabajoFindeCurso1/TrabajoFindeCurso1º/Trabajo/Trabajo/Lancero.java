package Trabajo;

public class Lancero extends Ejercito {
	private int IdUnidad = 003;
	private String Nombre = "Lanceros";
	private int Nšunidades = 120;
	private int Poder = 330;
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
		return "Lancero [IdUnidad=" + IdUnidad + ", Nombre=" + Nombre + ", Nšunidades=" + Nšunidades + ", Poder="
				+ Poder + "]";
	}
	public Lancero() {
		super();
	}
	public Lancero(int idUnidad, String nombre, int nšunidades, int poder) {
		super();
		IdUnidad = idUnidad;
		Nombre = nombre;
		Nšunidades = nšunidades;
		Poder = poder;
	}
	
}
