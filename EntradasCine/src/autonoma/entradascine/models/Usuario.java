package autonoma.entradascine.models;

/**
 *
 * @author Santiago Castro Marlés 
 */

public class Usuario {
    
    private String nombre;
    private String tipoUsuario;
    private int edad;
    private Pelicula peli = new Pelicula ();

    public Usuario() {
    }

    public Usuario(String nombre, String tipoUsuario, int edad, Pelicula peli) {
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        this.edad = edad;
        this.peli = peli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public float descuentoPorEdad()
    {
        float descuentoEdad = 0;
        if (this.edad < 18)
        {
            descuentoEdad = 500;
            return descuentoEdad;
        }
        else if (this.edad >= 18 && this.edad < 60)
        {
            return descuentoEdad;
        }
        else
        {
            descuentoEdad = 1000;
            return descuentoEdad;
        }
        
    }
}
