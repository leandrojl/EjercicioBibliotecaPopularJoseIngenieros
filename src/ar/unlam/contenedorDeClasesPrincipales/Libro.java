package ar.unlam.contenedorDeClasesPrincipales;

import java.util.Comparator;
import java.util.Objects;



public class Libro implements Comparable<Libro>{
	
	private String nombre;
	private String autor;
	private Integer caracteres;
	private Integer fechaDePublicacion;
	private String generoLiterario;

	public Libro(String nombre, String autor) {
		this.nombre=nombre;
		this.autor = autor;
	}
	public Libro() {
		
	}
	public Libro(String nombre, String autor, Integer caracteres, Integer fechaDePublicacion) {
		this.nombre = nombre;
		this.autor = autor;
		this.caracteres = caracteres;
		this.fechaDePublicacion = fechaDePublicacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Integer getCaracteres() {
		return caracteres;
	}
	public void setCaracteres(Integer caracteres) {
		this.caracteres = caracteres;
	}
	public Integer getFechaDePublicacion() {
		return fechaDePublicacion;
	}
	
	public String getGeneroLiterario() {
		return generoLiterario;
	}
	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}
	public void setFechaDePublicacion(Integer fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(autor, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return this.caracteres  - o.caracteres;
	}
	
		

}
