package Trabajo;

public class Espadachin extends Ejercito{
	private int IdUnidad = 001;
	private String Nombre = "Espadachines";
	private int Nšunidades = 120;
	private int Poder = 350;
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
		return "Espadachin [IdUnidad=" + IdUnidad + ", Nombre=" + Nombre + ", Nšunidades=" + Nšunidades + ", Poder="
				+ Poder + "]";
	}
	public Espadachin() {
		super();
	}
	public Espadachin(int idUnidad, String nombre, int nšunidades, int poder) {
		super();
		IdUnidad = idUnidad;
		Nombre = nombre;
		Nšunidades = nšunidades;
		Poder = poder;
	}
	
}
