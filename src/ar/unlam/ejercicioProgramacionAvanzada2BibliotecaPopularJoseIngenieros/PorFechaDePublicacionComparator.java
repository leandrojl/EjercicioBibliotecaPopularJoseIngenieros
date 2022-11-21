package ar.unlam.ejercicioProgramacionAvanzada2BibliotecaPopularJoseIngenieros;

import java.util.Comparator;

public class PorFechaDePublicacionComparator implements Comparator<Libro>{

	@Override
	public int compare(Libro libroUno, Libro libroDos) {
		
		return libroUno.getFechaDePublicacion().compareTo(libroDos.getFechaDePublicacion());
	}

}
