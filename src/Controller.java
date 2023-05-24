import javax.swing.*;

public class Controller {
    static Model miModelo = new Model();
    static View miVista = new View();
    public static void main(String[] args) {


            IU.crearVentana();
        }
    /**
     * Crea un coche
     * @param modelo    del coche
     * @param matricula identificador unico
     */
    public static void crearCoche(String modelo, String matricula){
        //creamos el coche y mostramos un mensaje conforme se ha creado
        Coche aux = miModelo.crearCoche(modelo,matricula);
        if(aux!=null){
            JOptionPane.showMessageDialog(null,"Coche Creado");
        }
    }
    /**
     * Baja la velocidad del coche
     * @param matricula identificador unico
     */

    public static void bajarVelocidad(String matricula){
        // Bajamos la velocidad del coche.
       miModelo.bajarVelocidad(matricula);
        JOptionPane.showMessageDialog(null,"Velocidad cambiada");
    }
    /**
     * Sube la velocidad del coche
     * @param matricula identificador unico
     */

    public static void aumentarVelocidad(String matricula){
        // Bajamos la velocidad del coche.
         miModelo.subirVelocidad(matricula);
        JOptionPane.showMessageDialog(null,"Velocidad cambiada");
    }
    /**
     * Muestra los datos del coche
     * @param matricula identificador unico
     */
    public static void enseñarDatos(String matricula){
        // Enseñamos los datos del coche.
        miVista.mostrarDatos(matricula);
    }
}


