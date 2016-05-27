/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Barco
{
    private String matricula;
    private float eslora;
    private int anoFabricacion;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula,float eslora,int anoFabricacion)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }

    /**
     * Método que devuelve la matricula del barco
     */
    public String getMatricula(){
        return matricula;
    }
    
    /**
     * Método que devuelve la eslora del barco en metros
     */
    public float getEslora(){
        return eslora;
    }
    
    /**
     * Método que devuelve el año de fabricacion del barco
     */
    public int getAnoFabricacion(){
        return anoFabricacion;
    }
    
    /**
     * Método que devuelve el coeficiente de Bernua
     */
    public abstract int getCoeficienteBernua();
    
    /**
     * Método toString que devuelve los datos del barco
     */
    @Override
    public String toString(){
        return "Matricula: " + matricula + "\nEslora: " + eslora + "\nAño de fabricacion: " + anoFabricacion;
    }
}
