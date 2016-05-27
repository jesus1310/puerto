
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private String nombre;
    private String dni;
    
    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre,String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Método que devuelve el dni del ciente
     */
    public String getDni(){
        return dni;
    }
    
    /**
     * Método que devuelve el nombre del cliente
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Método toString que muestra los datos del cliente
     */
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nDNI: " + dni;
    }
}
