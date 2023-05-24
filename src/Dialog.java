import javax.swing.*;

public class Dialog extends JDialog {
    private JPanel contentPane;
    private JLabel mensaje;



    public Dialog(){
        setContentPane(contentPane);
        setModal(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    /**
     * Mostramos un diálogo modal con información
     * @param mensajito información que queremos mostrar
     */

    public static void vDialogo(String mensajito){
        Dialog dialogo = new Dialog();
        dialogo.pack();
        dialogo.mensaje.setText(mensajito);
        dialogo.setVisible(true);
    }
}

