package autonoma.entradascine.models;
import java.util.ArrayList;

/**
 *
 * @author LAPTOP
 */

public class Cine {
    private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    private Boleta boleta = new Boleta ();
    private Factura factura = new Factura();
    private Funcion funcion = new Funcion();

    public Cine() {
    }
    
    public void agregarPelicula (String nombre, float costoBase)
    {
      Pelicula pelicula = new Pelicula ();
      pelicula.setNombre(nombre);
      pelicula.setCostoBase(costoBase);
      this.peliculas.add(pelicula);
    }
    
    public void eliminarPelicula (String nombre)
    {
      for (int i = 0; i < this.peliculas.size(); i++)
      {
         if (this.peliculas.get(i).getNombre().equals(nombre))
         {
             peliculas.remove(i);
             break;
         } 
      }
    }
    
    
    public void venderBoleta (Usuario usuario, Pelicula pelicula, Funcion funcion)
    {
        
        this.boleta.setUsuario(usuario);
        this.factura.añadirBoleta(boleta);
        
        
    }
}
