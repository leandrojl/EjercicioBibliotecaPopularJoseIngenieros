package ar.unlam.Comparadores;

import java.util.Comparator;

import ar.unlam.contenedorDeClasesPrincipales.Libro;

public class PorFechaDePublicacionComparator implements Comparator<Libro>{

	@Override
	public int compare(Libro libroUno, Libro libroDos) {
		
		return libroUno.getFechaDePublicacion().compareTo(libroDos.getFechaDePublicacion());
	}

}
