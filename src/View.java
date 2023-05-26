public class View {
    /**
     * Método para mostrar la velocidad.
     * @param matricula
     * @param v
     */
    void muestraVelocidad(String matricula, Integer v) {
        Dialog.vDialogo("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");
    }
    /**
     * Método para mostrar el exceso de velocidad.
     * @param vel
     */
    void muestraExceso(Integer vel) {
        if (vel > 120) {
            Dialog.vDialogo("Alerta: velocidad excedida!");
        }

    }
}



