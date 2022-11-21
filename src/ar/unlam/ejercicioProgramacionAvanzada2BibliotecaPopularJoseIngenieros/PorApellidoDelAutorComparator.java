package ar.unlam.ejercicioProgramacionAvanzada2BibliotecaPopularJoseIngenieros;

import java.util.Comparator;

public class PorApellidoDelAutorComparator implements Comparator<Libro>{

	@Override
	public int compare(Libro libroUno, Libro libroDos) {
		// TODO Auto-generated method stub
		return libroUno.getAutor().compareTo(libroDos.getAutor());
	}

}
