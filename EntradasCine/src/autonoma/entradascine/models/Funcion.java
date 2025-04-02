package autonoma.entradascine.models;

/**
 *
 * @author LAPTOP
 */

public class Funcion {
    
    private String horario;
    private Pelicula peli = new Pelicula ();

    public Funcion() {
    }

    public Funcion(String horario, Pelicula peli) {
        this.horario = horario;
        this.peli = peli;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public float calcularDescuentoHorario()
    {
        float descuentoHorario = 0;
        if (this.horario.equals("Primera funcion"))
        {
            descuentoHorario = (float) (peli.getCostoBase() - (peli.getCostoBase() * 0.50)); 
            return descuentoHorario;
        }
        else if (this.horario.equals("Funcion en la tarde"))
        {
            descuentoHorario = (float) (peli.getCostoBase() - (peli.getCostoBase() * 0.10)); 
            return descuentoHorario;
        }
        else if (this.horario.equals("Funcion en la noche"))
        {
            return descuentoHorario;
        }
        else
        {
            return descuentoHorario;
        }
    }
}
