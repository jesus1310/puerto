/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    private int numeroDias;
    private Cliente cliente;
    private Barco barco;
    private static final int VALOR_FIJO_ALQUILER = 300;
    private static final int MULTIPLICADOR_ESLORA = 10;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int numeroDias,Cliente cliente,Barco barco)
    {
        this.numeroDias = numeroDias;
        this.cliente = cliente;
        this.barco = barco;
    }

    /**
     * Método que devuelve el coste del alquiler
     */
    public float getCosteAlquiler(){
        return numeroDias * (barco.getEslora() * MULTIPLICADOR_ESLORA) + VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua();
    }
    
    /**
     * Método toString que muestra los datos del alquiler
     */
    @Override
    public String toString(){
        return "Número de días: " + numeroDias + "\nCliente: " + cliente + "\nBarco: " + barco + "\nCoste alquiler: " + getCosteAlquiler();
    }
}
