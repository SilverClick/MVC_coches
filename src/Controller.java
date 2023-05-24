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
       miModelo.bajarVelocidad(matricula);
        miVista.mostrarDatos(matricula);
    }
    /**
     * Sube la velocidad del coche
     * @param matricula identificador unico
     */

    public static void aumentarVelocidad(String matricula){
         miModelo.subirVelocidad(matricula);
        miVista.mostrarDatos(matricula);
    }
    /**
     * Muestra los datos del coche
     * @param matricula identificador unico
     */
    public static void enseñarDatos(String matricula){
        miVista.mostrarDatos(matricula);
    }
}


