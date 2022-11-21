package ar.unlam.ejercicioProgramacionAvanzada2BibliotecaPopularJoseIngenieros;

import java.util.ArrayList;
import java.util.TreeSet;

public class Biblioteca{

	private String nombre;
	private TreeSet<Libro> almacenamientoDeLibros = new TreeSet<Libro>();

	public Biblioteca(String nombre) {
		this.nombre = nombre;
	}
	
	public Biblioteca() {
		
	}

	public Biblioteca(String nombreBiblioteca, PorApellidoDelAutorComparator comparador) {
		this.nombre = nombreBiblioteca;
		this.almacenamientoDeLibros = new TreeSet<Libro>(comparador);
	}

	public Biblioteca(String nombreBiblioteca, PorFechaDePublicacionComparator comparador) {
		this.nombre = nombreBiblioteca;
		this.almacenamientoDeLibros = new TreeSet<Libro>(comparador);
	}

	public Biblioteca(String nombreBiblioteca, PorCantidadDeCaracteresComparator comparador) {
		this.nombre = nombreBiblioteca;
		this.almacenamientoDeLibros = new TreeSet<Libro>(comparador);
	}

	public void agregarLibro(Libro libro) {
		almacenamientoDeLibros.add(libro);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TreeSet<Libro> getAlmacenamientoDeLibros() {
		return almacenamientoDeLibros;
	}

	public void setAlmacenamientoDeLibros(TreeSet<Libro> almacenamientoDeLibros) {
		this.almacenamientoDeLibros = almacenamientoDeLibros;
	}



	
	
	

}
