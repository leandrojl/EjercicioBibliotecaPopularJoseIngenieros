package ar.unlam.Comparadores;

import java.util.Comparator;

import ar.unlam.contenedorDeClasesPrincipales.Libro;

public class PorApellidoDelAutorComparator implements Comparator<Libro>{

	@Override
	public int compare(Libro libroUno, Libro libroDos) {
		// TODO Auto-generated method stub
		return libroUno.getAutor().compareTo(libroDos.getAutor());
	}

}
