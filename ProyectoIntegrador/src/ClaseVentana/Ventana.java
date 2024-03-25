package ClaseVentana;

import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana(){
        this.setSize(500,500); // Se establece el tamaño de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Se establece que el proceso se finalice al cerrar la ventana
        this.setTitle("EcuPlot");// Se establece el titulo de la ventana
        this.setLocationRelativeTo(null); //Se establece que la ventana estara en el centro de la pantalla
    }
}
