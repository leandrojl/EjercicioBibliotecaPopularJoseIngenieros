package ar.unlam.ejercicioProgramacionAvanzada2BibliotecaPopularJoseIngenieros;

import org.junit.Test;


import junit.framework.Assert;

public class BibliotecaTest {

	
	@Test
	public void queCreoUnaBibliotecaConUnLibroConTituloNombreAutorCaracteresYFechaDePublicacion() {
		Biblioteca biblioteca = dadoQueTengoUnaBibliotecaConNombre("Biblioteca Popular Jose Ingenieros");
		Libro libro = dadoQueTengoUnLibroConNombreAutorCaracteresYFechaDePublicacion("Wasted Lives", "Bauman", 1600,2003);
		Libro libro1 = dadoQueTengoUnLibroConNombreAutorCaracteresYFechaDePublicacion("Wasted Livess", "Bauman", 1603,2003);
		Libro libro2 = dadoQueTengoUnLibroConNombreAutorCaracteresYFechaDePublicacion("Wasted Lives", "Baumann", 1601,2003);
		cuandoLeAgregoUnLibro(biblioteca, libro);
		cuandoLeAgregoUnLibro(biblioteca, libro1);
		cuandoLeAgregoUnLibro(biblioteca, libro2);
		entoncesTengoLaBibliotecaConUnLibro(biblioteca, libro);
		for(Libro s: biblioteca.getAlmacenamientoDeLibros()) {
			System.out.println(s.getCaracteres());
		}
	}
	
	

	@Test
	public void queCreoUnaBibliotecaConCincoLibrosYLosOrdenoPorApellidoDelAutor() {
		PorApellidoDelAutorComparator comparador = new PorApellidoDelAutorComparator();
		Biblioteca biblioteca = dadoQueTengoUnaBibliotecaConNombreYComparador("Biblioteca Popular Jose Ingenieros", comparador);
		cuandoAgregoCincoLibrosALaBiblioteca(biblioteca);
		
		String primeroEsperado = "Bauman";
		String primeroObtenido = biblioteca.getAlmacenamientoDeLibros().first().getAutor();
		String ultimoEsperado = "Walsh";
		String ultimoObtenido = biblioteca.getAlmacenamientoDeLibros().last().getAutor();
		/*
		for(Libro s: biblioteca.getAlmacenamientoDeLibros()) {
			System.out.println(s.getAutor());
		}*/
		
		Assert.assertEquals(primeroEsperado,primeroObtenido);
		Assert.assertEquals(ultimoEsperado,ultimoObtenido);
		
		
	}
	
	@Test
	public void queCreoUnaBibliotecaConCincoLibrosYLosOrdenoPorFechaDePublicacionDelAutor() {
		PorFechaDePublicacionComparator comparador = new PorFechaDePublicacionComparator();
		Biblioteca biblioteca = dadoQueTengoUnaBibliotecaConNombreYComparadorPorFechaDePublicacion("Biblioteca Popular Jose Ingenieros", comparador);
		cuandoAgregoCincoLibrosALaBiblioteca(biblioteca);
		
		Integer primeroEsperado = 1915;
		Integer primeroObtenido = biblioteca.getAlmacenamientoDeLibros().first().getFechaDePublicacion();
		Integer ultimoEsperado = 2003;
		Integer ultimoObtenido = biblioteca.getAlmacenamientoDeLibros().last().getFechaDePublicacion();
		/*
		for(Libro s: biblioteca.getAlmacenamientoDeLibros()) {
			System.out.println(s.getFechaDePublicacion());
		}*/
		
		Assert.assertEquals(primeroEsperado,primeroObtenido);
		Assert.assertEquals(ultimoEsperado,ultimoObtenido);
	}
	
	@Test
	public void queCreoUnaBibliotecaConCincoLibrosYLosOrdenoPorCantidadDeCaracteres() {
		PorCantidadDeCaracteresComparator comparador = new PorCantidadDeCaracteresComparator();
		Biblioteca biblioteca = dadoQueTengoUnaBibliotecaConNombreYComparadorPorCantidadDeCaracteres("Biblioteca Popular Jose Ingenieros", comparador);
		cuandoAgregoCincoLibrosALaBiblioteca(biblioteca);
		
		Integer primeroEsperado = 1600;
		Integer primeroObtenido = biblioteca.getAlmacenamientoDeLibros().first().getCaracteres();
		Integer ultimoEsperado = 3100;
		Integer ultimoObtenido = biblioteca.getAlmacenamientoDeLibros().last().getCaracteres();
		
		/*
		for(Libro s: biblioteca.getAlmacenamientoDeLibros()) {
			System.out.println(s.getCaracteres());
		}*/
		Assert.assertEquals(primeroEsperado,primeroObtenido);
		Assert.assertEquals(ultimoEsperado,ultimoObtenido);
	}

	

	private Biblioteca dadoQueTengoUnaBibliotecaConNombreYComparadorPorCantidadDeCaracteres(String nombreBiblioteca,
			PorCantidadDeCaracteresComparator comparador) {
		// TODO Auto-generated method stub
		return new Biblioteca(nombreBiblioteca, comparador);
	}

	private Biblioteca dadoQueTengoUnaBibliotecaConNombreYComparadorPorFechaDePublicacion(String nombreBiblioteca,
			PorFechaDePublicacionComparator comparador) {
		return new Biblioteca(nombreBiblioteca, comparador);
	}

	private Biblioteca dadoQueTengoUnaBibliotecaConNombreYComparador(String nombreBiblioteca, PorApellidoDelAutorComparator comparador) {
		// TODO Auto-generated method stub
		return new Biblioteca(nombreBiblioteca, comparador);
	}

	private void cuandoAgregoCincoLibrosALaBiblioteca(Biblioteca biblioteca) {
		biblioteca.getAlmacenamientoDeLibros().add(new Libro("The Pragmatic Programmer", "Hunt", 2500,1999));
		biblioteca.getAlmacenamientoDeLibros().add(new Libro("Wasted Lives", "Bauman", 1600,2003));
		biblioteca.getAlmacenamientoDeLibros().add(new Libro("El inconsciente", "Freud", 2400,1915));
		biblioteca.getAlmacenamientoDeLibros().add(new Libro("Operacion Masacre", "Walsh", 2200,1957));
		biblioteca.getAlmacenamientoDeLibros().add(new Libro("In Cold Blood", "Capote", 3100,1967));
		
	}

	private void entoncesTengoLaBibliotecaConUnLibro(Biblioteca biblioteca, Libro libro) {
		Assert.assertEquals(libro, new Libro("Wasted Lives", "Bauman", 1900,2013));
		
	}

	private void cuandoLeAgregoUnLibro(Biblioteca biblioteca, Libro libro) {
		biblioteca.agregarLibro(libro);
		
	}
	
	private Libro dadoQueTengoUnLibroConNombreAutorCaracteresYFechaDePublicacion(String nombre, String autor, Integer caracteres,
			Integer fechaDePubliacion) {
		// TODO Auto-generated method stub
		return new Libro(nombre,autor,caracteres,fechaDePubliacion);
	}

	private Biblioteca dadoQueTengoUnaBibliotecaConNombre(String nombre) {
		return new Biblioteca(nombre);
		
	}
}
