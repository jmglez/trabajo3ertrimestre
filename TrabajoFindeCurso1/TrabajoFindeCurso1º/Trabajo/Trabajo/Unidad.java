package Trabajo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Trabajo.Conexion;

public class Unidad extends Ejercitoazul{//clase diseņada para contener los parametros usados por las otras clases
	private int IdUnidad;
	private String Nombre ;
	private int Nšunidades ;
	private int Poder ;
	

	public Unidad(int idUnidad, String nombre, int nšunidades, int poder) {
		super();
		IdUnidad = idUnidad;
		Nombre = nombre;
		Nšunidades = nšunidades;
		Poder = poder;
	}
	
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

	
	
}
