import java.util.ArrayList;

/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // Almacena una coleccion de alquileres
    private ArrayList<Alquiler> alquileres;
    // Almacena el numero de amarres que hay en el puerto
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new ArrayList<>();
    }

    /**
     * Añade un alquiler a la coleccion de alquileres
     * Devuelve la posicion del barco o -1 si no lo puede añadir
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco,int posicion)
    {        
        int posicionFinal = -1;
        boolean mismoAmarre = false;
        if (posicion - 1 >= 0 && posicion -1 < NUMERO_AMARRES) {
            if (alquileres.size() == 0) {
                alquileres.add(new Alquiler(numeroDias, cliente, barco,posicion));
                posicionFinal = posicion;
            }
            else {
                for (int i = 0; i < alquileres.size(); i++) {
                    if (alquileres.get(i).getPosicionAmarre() == posicion) {
                        mismoAmarre = true;
                    }
                }
                if (!mismoAmarre) {
                    alquileres.add(new Alquiler(numeroDias, cliente, barco,posicion));
                    posicionFinal = posicion;
                }
            }
        }
        else {
            System.out.println("El amarre introducido debe estar entre 1 y " + NUMERO_AMARRES);
        }
        return posicionFinal;
    }

    /**
     * Devuelve el precio del alquiler si el amarre esta ocupado o te informa de si esta vacio
     */
    public void verEstadoAmarres()
    {
        String estado[] = {"El amarre 1 esta vacio","El amarre 2 esta vacio","El amarre 3 esta vacio","El amarre 4 esta vacio"};
        String cadena = null;
        for (int i = 0; i < alquileres.size(); i++) {
            if (alquileres.get(i).getPosicionAmarre() > 0) {
                estado[alquileres.get(i).getPosicionAmarre() - 1]= "Precio del alquiler " + 
                alquileres.get(i).getPosicionAmarre() + 
                ": " + alquileres.get(i).getCosteAlquiler();                
            }           
        }
        for (int i = 0; i < estado.length; i++) {
            System.out.println(estado[i]);
        }
    }

    /**
     * Devuelve el coste del alquiler de un amarre y lo elimina de la coleccion
     */
    public float liquidarAlquiler(int posicion)
    {
        float coste = -1;
        if (posicion <= NUMERO_AMARRES && posicion > 0) {
            boolean alquilerLiquidado = false;
            for (int i = 0; i < alquileres.size() && !alquilerLiquidado; i++) {
                if (alquileres.get(i).getPosicionAmarre() == posicion) {
                    coste = alquileres.get(posicion - 1).getCosteAlquiler();
                    alquileres.remove(posicion - 1);
                    alquilerLiquidado = true;
                }
            }                 
        }
        else {
            System.out.println("El amarre introducido debe estar entre 1 y " + NUMERO_AMARRES);
        }
        return coste;
    }
}
