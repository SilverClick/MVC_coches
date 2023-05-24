public class View {
    static Model miModelo = new Model();
    public static void crearVentana() {
        IU.crearVentana();
    }


    /**
     * Muestra los datos del coche
     * @param matricula del coche
     */
    void mostrarDatos(String matricula){
        // Enseñamos los datos del coche con la ventana del diálogo.
        Dialog.vDialogo("El coche " + matricula + " tiene los siguientes datos: "+"modelo: "+miModelo.getCoche(matricula).getModelo()+" matricula: "+
                miModelo.getCoche(matricula).getMatricula()+" velocidad: "+miModelo.getCoche(matricula).getVelocidad());
    }
}



