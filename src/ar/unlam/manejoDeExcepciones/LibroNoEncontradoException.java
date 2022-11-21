package ar.unlam.manejoDeExcepciones;

public class LibroNoEncontradoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public LibroNoEncontradoException() {
		super("Se genero esta excepcion porque el libro que quiere retirar no existe");
	}
	
	public LibroNoEncontradoException(String mensaje) {
		super(mensaje);
	}
}
