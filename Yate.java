/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    private int camarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(int camarotes,int potencia,String matricula,float eslora,int anoFabricacion)
    {
        super(potencia,matricula,eslora,anoFabricacion);
        this.camarotes = camarotes;
    }

    /**
     * Método que devuelve el coeficiente de bernua de este tipo de barco
     */
    @Override
    public int getCoeficienteBernua(){
        return camarotes;
    }
    
    /**
     * Método toString que muestra los datos de este tipo de barco
     */
    @Override
    public String toString(){
        return super.toString() + "\nCamarotes: " + camarotes;
    }
}
