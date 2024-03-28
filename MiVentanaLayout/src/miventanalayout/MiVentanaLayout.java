package miventanalayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MiVentanaLayout extends JFrame{

    public MiVentanaLayout(){
        super("Mi Ventana");
        setSize(500,500);
        setLocationRelativeTo(null);
        
        //Define el layout que utilizará el contenedor, en este caso es GridLayout
        setLayout(new GridLayout(2,3,10,50));
        
        //Se crean los botones que serán agregados al contenedor
        JButton btnA =  new JButton("boton A");
        JButton btnB =  new JButton("boton B");
        JButton btnC =  new JButton("boton C");
        JButton btnD =  new JButton("boton D");
        JButton btnE =  new JButton("boton E");
        JButton btnF =  new JButton("boton F");
        
        //Se agregan los componentes al contenedor, estos se acomodan conforme fueron ordenados en el código
        getContentPane ().add(btnA);
        getContentPane ().add(btnB);
        getContentPane ().add(btnC);
        getContentPane ().add(btnD);
        getContentPane ().add(btnE);
        getContentPane ().add(btnF);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    
    }
    public static void main(String[] args) {
        new MiVentanaLayout();
    }
    
}
