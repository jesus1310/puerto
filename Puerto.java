/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private Alquiler[] alquileres;
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     * Método que añade un alquiler a la lista
     * Si lo añade correctamente devuelve la posición en la que se ha añadido
     * Si no lo puede añadir devuelve -1
     */
    public int addAlquiler(int numeroDias,Cliente cliente,Barco barco){
        int pos = -1;
        Alquiler nuevoAlquiler = new Alquiler(numeroDias,cliente,barco);
        for (int i = 0; i < alquileres.length; i++){
            if (alquileres[i] == null){
                pos = i;
                alquileres[i] = nuevoAlquiler;
            }
        }
        return pos;
    }
    
    /**
     * Método que muestra los datos de los amarres
     */
    public void verEstadoAmarres(){
        for (int i = 0; i < alquileres.length; i++){
            if (alquileres[i] != null){
                System.out.println("El amarre que ocupa la posición: " + i + " tiene un coste de: " + alquileres[i].getCosteAlquiler());
            }
            else {
                System.out.println("El amarre que ocupa la posición: " + i + " está vacío");
            }
        }
    }
    
    /**
     * Método que devuelve el coste de un alquiler y lo elimina de la colección
     */
    public float liquidarAlquiler(int posicion){
        float valorDevuelto = alquileres[posicion].getCosteAlquiler();
        alquileres[posicion] = null;
        return valorDevuelto;
    }
}
