package ar.unlam.ejercicioProgramacionAvanzada2BibliotecaPopularJoseIngenieros;

import java.util.Comparator;

public class PorCantidadDeCaracteresComparator implements Comparator<Libro> {
	@Override
	public int compare(Libro libroUno, Libro libroDos) {
		
		return libroUno.getCaracteres().compareTo(libroDos.getCaracteres());
	}
}
