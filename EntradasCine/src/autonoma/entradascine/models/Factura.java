package autonoma.entradascine.models;
import java.util.ArrayList;
/**
 *
 * @author LAPTOP
 */

public class Factura {
    
    private ArrayList<Boleta> boletas = new ArrayList<>();
    private float total;

    public Factura() {
    }

    public Factura(float total) {
        this.total = total;
    }

    public ArrayList<Boleta> getBoletas() {
        return boletas;
    }

    public void añadirBoleta (Boleta boleta) {
        this.boletas.add(boleta);
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public float calcularTotal()
    {
        float total = 0;
        
        for (int i = 0; i < boletas.size(); i++)
        {
            total += this.boletas.get(i).getPrecioFinal();
        }
        
        return total;
    }
    
}
