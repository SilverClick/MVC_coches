import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class ObsExceso implements Observer {
    View miVista = new View();
    @Override
    public void update(Observable o, Object arg) {
        //Precisamos castear el objeto a Coche
        Coche obxC = (Coche) arg;
        miVista.muestraExceso(obxC.velocidad);
        miVista.muestraVelocidad(obxC.matricula, obxC.velocidad);

        }
    }

