package negocio;

/**
 * La interfaz CatalogoPeliculas contiene las operaciones necesarias de la
 * aplicación.
 *
 * @author Angonoa Franco
 * @since Junio 2020
 * @version 1.0
 */
public interface CatalogoPeliculas {

    public void agregarPelicula(String nombrePelicula, String nombreArchivo);

    public void listarPeliculas(String nombreArchivo);

    public void buscarPelicula(String nombreArchivo, String buscar);

    public void inciarArchivo(String nombreArchivo);
}
