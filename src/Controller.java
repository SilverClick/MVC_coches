public class Controller {
    static Model miModelo = new Model();
    static View miVista = new View();
    public static void main(String[] args) {
        ObsExceso exceso = new ObsExceso();
        miModelo.addObserver(exceso);
        IU.crearVentana();
    }

    /**
     * Método para crear el coche.
     * @param modelo
     * @param matricula
     */
    public static void crearCoche(String modelo, String matricula){
        Coche aux = miModelo.crearCoche(modelo,matricula);
        if(aux!=null){
            miVista.muestraVelocidad(aux.matricula, aux.velocidad);
        }
    }

    /**
     * Método para bajar la velocidad del coche.
     * @param matricula
     */
    public static void bajarVelocidad(String matricula){
        miModelo.bajarVelocidad(matricula);
    }

    /**
     * Método para bajar la velocidad del coche.
     * @param matricula
     */
    public static void aumentarVelocidad(String matricula){
        miModelo.subirVelocidad(matricula);
    }
}


