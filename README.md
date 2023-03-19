# Ejercicio: Biblioteca Popular Jose Ingenieros utlizando Java.

## Descripcion del Proyecto:

Este proyecto se basa en un ejercicio practico a resolver dictado por la Universidad de La Matanza el cual se pide resolver utilizando el framework de Collectionsde Java.

### Tecnologias utilizadas:

Para resolver el siguiente ejercicio se utilizo el lenguaje Java enfocado en el paradigma de Programacion Orientada a Objetos conjuntamente con el manejo de clases. Se emplean casos de testeos unitarios, utilizacion de Exceptions en errores previstos y uso del framework Collection de Java para poder almacenar los distintos objetos (en este caso libros) en base a lo que la consigna exije para el correcto funcionamiento de la biblioteca.

### Consigna detallada del proyecto:

Biblioteca Popular José Ingenieros

Se desea administrar los libros de una Biblioteca Popular.
Se quiere guardar los libros, y poder ordenarlos según distintos criterios.
1. Del más largo al más Breve.
2. Por Apellido del Autor
3. Por título normalizado (“El ingenioso hidalgo don Quijote de la Mancha” -> “Ingenioso hidalgo don
Quijote de la Mancha, El” / “El Secreto” – “Secreto, El”)
4. Por Publicación
Se desea además saber si se compró dos veces el mismo libro, y como puede ser distintas ediciones, le
basta que el titulo del libro y el autor se considere que es el mismo libro.
Se quiere asignarle un genero literario a cada libro (Ficción, Divulgación, Autoayuda, etc...).
Se desea contar los libros por cada Género.
Recortar para optimizar en la web el largo a 200 caracteres. Este límite se quiere conservar en una
constante pero que se permita cambiar en próximas ejecuciones
Realice los casos de prueba para la funcionalidad requerida.

### Testeos desarrollados:

queCreoUnaBibliotecaConUnLibroConTituloNombreAutorCaracteresYFechaDePublicacion();

queQuieroRetirarUnLibroQueNoEstaEnLaBiblioteca();

queQuieroConsultarUnLibroQueNoEstaEnLaBibliotecaYLanzaLibroNoEncontradoException();

queCreoUnaBibliotecaConCincoLibrosYLosOrdenoPorApellidoDelAutor();

queCreoUnaBibliotecaConCincoLibrosYLosOrdenoPorFechaDePublicacionDelAutor();

queCreoUnaBibliotecaConCincoLibrosYLosOrdenoPorCantidadDeCaracteres();

## License

MIT License

Copyright (c) [2023] [leandrojl]

