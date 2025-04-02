package autonoma.entradascine.models;

/**
 *
 * @author LAPTOP
 */
public class Funcion {
    
    private String horario;
    private float descuento;
    private Pelicula peli = new Pelicula ();

    public Funcion() {
    }

    public Funcion(String horario, float descuento, Pelicula peli) {
        this.horario = horario;
        this.descuento = descuento;
        this.peli = peli;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
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
        else
        {
            return descuentoHorario;
        }
    }
}
