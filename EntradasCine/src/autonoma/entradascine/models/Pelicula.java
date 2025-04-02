package autonoma.entradascine.models;

/**
 *
 * @author Santiago Castro Marles
 */

public class Pelicula {
    
    private String nombre;
    private float costoBase;

    public Pelicula() {
    }

    public Pelicula(String nombre, float costoBase) {
        this.nombre = nombre;
        this.costoBase = costoBase;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(float costoBase) {
        this.costoBase = costoBase;
    }
    
    
}
