package negocio;

import datos.AccesoDatos;
import datos.AccesoDatosFile;

/**
 * La clase CatalogoPeliculasImpl contiene la implementación de las operaciones.
 * Esta clase sirve como intermediaria entre el menú principal y el acceso a
 * datos.
 *
 * Cada método realiza las mismas funcionalidades que los implementados en
 * AccesoDatos que podemos acceder mediante el campo datos. Además, aquí se
 * crearán los objetos que serán pasado como argumentos y se realizará el manejo
 * de las excepciones.
 *
 * @author Angonoa Franco
 * @since Junio 2020
 * @version 1.0
 */
public class CatalogoPeliculasImp implements CatalogoPeliculas {

    public static AccesoDatos datos;

    public CatalogoPeliculasImp() {
        datos = new AccesoDatosFile();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        //Hacer
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        //Hacer
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        //Hacer
    }

    @Override
    public void inciarArchivo(String nombreArchivo) {
        //Hacer
    }

}
