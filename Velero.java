/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(int numeroMastiles,String matricula,float eslora,int anoFabricacion)
    {
        super(matricula,eslora,anoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    /**
     * Método que devuelve el coeficiente de bernua de este tipo de barco
     */
    @Override
    public int getCoeficienteBernua(){
        return numeroMastiles;
    }
    
    /**
     * Método toString que muestra los datos de este tipo de barco
     */
    @Override
    public String toString(){
        return super.toString() + "\nnumeroMastiles: " + numeroMastiles;
    }
}
