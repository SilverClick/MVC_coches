import java.util.ArrayList;
import java.util.Observable;

public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     *
     * @param modelo    del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public static Coche crearCoche(String modelo, String matricula) {
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     *
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public  Coche getCoche(String matricula) {
        Coche aux = null;
        // recorre el arrayList buscando por matricula
        for (Coche e : parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * @param matricula
     * @param v         nueva velocidad
     * @return velocidad modificada
     */
    public Integer cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Aumenta la velocidad de un coche
     *
     * @param matricula del coche
     * @return velocidad aumentada
     */
    public Integer subirVelocidad(String matricula) {
        // busca el coche y sube la velocidad
        getCoche(matricula).velocidad = getCoche(matricula).velocidad + 10;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Disminuye la velocidad de un coche
     *
     * @param matricula del coche
     * @return velocidad disminuida
     */
    public Integer bajarVelocidad(String matricula) {
        // busca el coche y sube la velocidad
        getCoche(matricula).velocidad = getCoche(matricula).velocidad - 10;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }
    // retorna la nueva velocidad


    /**
     * Devuelve la velocidad segun la matricula
     *
     * @param matricula
     * @return
     */
    public Integer getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }

}
