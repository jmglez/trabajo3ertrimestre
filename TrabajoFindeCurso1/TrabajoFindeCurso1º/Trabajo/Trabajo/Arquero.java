package Trabajo;

public class Arquero extends Ejercito{
	private int IdUnidad = 002;
	private String Nombre = "Arqueros";
	private int Nšunidades = 90;
	private int Poder = 400;
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
		return "Arquero [IdUnidad=" + IdUnidad + ", Nombre=" + Nombre + ", Nšunidades=" + Nšunidades + ", Poder="
				+ Poder + "]";
	}
	public Arquero() {
		super();
	}
	public Arquero(int idUnidad, String nombre, int nšunidades, int poder) {
		super();
		IdUnidad = idUnidad;
		Nombre = nombre;
		Nšunidades = nšunidades;
		Poder = poder;
	}
	
}
