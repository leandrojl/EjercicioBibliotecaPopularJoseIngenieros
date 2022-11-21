package ar.unlam.Comparadores;

import java.util.Comparator;

import ar.unlam.contenedorDeClasesPrincipales.Libro;

public class PorCantidadDeCaracteresComparator implements Comparator<Libro> {
	@Override
	public int compare(Libro libroUno, Libro libroDos) {
		
		return libroUno.getCaracteres().compareTo(libroDos.getCaracteres());
	}
}
