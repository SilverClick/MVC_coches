import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Entorno gráfico - Interfaz de Usuario
 */
public class IU{


        private JButton crearCoche;
        private JPanel panel;
        private JTextField modelo;
        private JTextField matricula;
        private JButton subirVelocidadButton;
        private JButton bajarVelocidadButton;
        private JTextField matriculadelcoche;
    private JButton mostrarDatosButton;



     Controller miControlador;
    // necesitamos el controlador aqui para avisar de los eventos


    /**
     * Constructor del entorno gráfico
     * tendrá los listener de la interfaz gráfica
     */
    public IU() {
        // instanciamos el controlador
        // para avisar según la interacción del usuario
        miControlador = new Controller();
        // añadimos listener al boton


        /**
         * Configuramos el botón para crear el coche
         * @param new ActionListener
         */
        crearCoche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("creando coche");
                // le decimos al controlador que cree un coche
                miControlador.crearCoche(modelo.getText(), matricula.getText());

            }
        });
        /**
         * Configuramos el botón para bajar la velocidad
         * @param new ActionListener
         */
        bajarVelocidadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               miControlador.bajarVelocidad(matricula.getText());

            }
        });
        /**
         * Configuramos el botón para subir la velocidad
         * @param new ActionListener
         */
        subirVelocidadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miControlador.aumentarVelocidad(matricula.getText());
            }
        });
        /**
         * Configuramos el botón para enseár los datos del coche
         * @param new ActionListener
         */

        mostrarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // le decimos al controlador que muestre los datos
                miControlador.enseñarDatos(matriculadelcoche.getText());
            }
        });

    }
        /**
         * Inicializa la Interfaz del Usuario
         * Lo llamaremos en el constructor de la vista
         */

            public static void crearVentana () {
                JFrame jframe = new JFrame("App MVC");
                jframe.setContentPane(new IU().panel);
                jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jframe.pack();
                jframe.setVisible(true);
            }
        }



