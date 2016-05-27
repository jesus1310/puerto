
/**
 * Write a description of class EmbarcacionDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDeportiva extends Barco
{
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionDeportiva
     */
    public EmbarcacionDeportiva(int potencia,String matricula,float eslora,int anoFabricacion)
    {
        super(matricula,eslora,anoFabricacion);
        this.potencia = potencia;
    }

    /**
     * Método que devuelve el coeficiente de bernua de este tipo de barco
     */
    @Override
    public int getCoeficienteBernua(){
        return potencia;
    }
    
    /**
     * Método toString que muestra los datos de este tipo de barco
     */
    public String toString(){
        return super.toString() + "\nPotencia: " + potencia;
    }
}
