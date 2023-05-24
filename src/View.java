public class View {
    public static void crearVentana() {
        IU.crearVentana();
    }


    /**
     * Muestra la velocidad
     * @param matricula del coche
     * @param v velocidad que ueremos mostrar
     * @return true si todo bien
     */
    void muestraVelocidad(String matricula, Integer v){
        Dialog.vDialogo("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");
    }
}



