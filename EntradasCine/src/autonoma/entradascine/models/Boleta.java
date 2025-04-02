package autonoma.entradascine.models;

/**
 *
 * @author LAPTOP
 */
public class Boleta {
    private Usuario usuario = new Usuario();
    private float precioFinal;
    private Funcion funcion = new Funcion();

    public Boleta() {
    }

    public Boleta(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }
    
    public float calcularPrecioFinal ()
    {
        float precioFinal = 0;
        precioFinal = usuario.descuentoPorEdad() + funcion.calcularDescuentoHorario();
        return precioFinal;
    }
}
