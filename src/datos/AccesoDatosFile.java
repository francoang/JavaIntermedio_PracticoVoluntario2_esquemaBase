package datos;

import dominio.Pelicula;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Contiene las operaciones a ejecutar en el archivo de peliculas.txt
 * implementadas con Path y File, además de los Flujos de byte o caracter. Lo
 * ideal es que cada método declare las excepciones creadas en el paquete
 * excepciones.
 *
 * @author Angonoa Franco
 * @since Junio 2020
 * @version 1.0
 */
public class AccesoDatosFile implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        Path path = Paths.get(nombreArchivo);
        return Files.exists(path);
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        return null;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        return null;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {

    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {

    }

}
