import javax.swing.*;

public class Controller {
    static Model miModelo = new Model();
    static View miVista = new View();
    public static void main(String[] args) {


            IU.crearVentana();
        }
    public static void crearCoche(String modelo, String matricula){
        Coche aux = miModelo.crearCoche(modelo,matricula);
        if(aux!=null){
            JOptionPane.showMessageDialog(null,"Coche Creado");
        }
    }

    public static void bajarVelocidad(String matricula){
       miModelo.bajarVelocidad(matricula);
        miVista.mostrarDatos(matricula);
    }

    public static void aumentarVelocidad(String matricula){
         miModelo.subirVelocidad(matricula);
        miVista.mostrarDatos(matricula);
    }
    public static void enseñarDatos(String matricula){
        miVista.mostrarDatos(matricula);
    }
}


