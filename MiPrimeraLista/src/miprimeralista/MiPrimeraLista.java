package miprimeralista;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class MiPrimeraLista extends JFrame{
    public MiPrimeraLista() {
    super("Mi Ventana con lista");
        setSize(400,400);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
        //Creacion de la instancia de la clase JComboBox
        JComboBox list = new JComboBox ();
        
        //Opcines que tendra la lisa
        list.addItem("Opcion 1");
        list.addItem("Opcion 2");
        list.addItem("Opcion 3");
        list.addItem("Opcion 4");
        list.addItem("Opcion 5");
        
        getContentPane().add(list);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
}
    public static void main(String[] args) {
        new MiPrimeraLista();
    }
    
}
