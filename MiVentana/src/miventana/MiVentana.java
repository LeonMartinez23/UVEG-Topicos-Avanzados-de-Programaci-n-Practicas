package miventana;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiVentana extends JFrame{
    public MiVentana(){
        super("Mi Ventana");
        setSize(1000,700);
        setLocationRelativeTo(null);
        
        //Define el layout que utilizará el contenedor, en este caso es BorderLayout
        setLayout(new GridLayout());
        
        JPanel panelA = new JPanel();
        panelA.setLayout(new BorderLayout());
        //Se crean los botones que serán agregados al contenedor
        JButton btnLineStart =  new JButton("boton line_start");
        JButton btnLineEnd =  new JButton("boton line_end");
        JButton btnPageStart =  new JButton("boto page_start");
        JButton btnPageEnd =  new JButton("boton page_end");
        JButton btnCenter =  new JButton("boton center");
        
        //Se agregan los componentes al contenedor y se definen las posiciones mediante las constantes que provee la clase BorderLayout
        panelA.add(btnLineStart, BorderLayout.LINE_START);
        panelA.add(btnLineEnd, BorderLayout.LINE_END);
        panelA.add(btnPageStart, BorderLayout.PAGE_START);
        panelA.add(btnPageEnd, BorderLayout.PAGE_END);
        panelA.add(btnCenter, BorderLayout.CENTER);
        
        JPanel panelB = new JPanel();
        panelB.setLayout(new FlowLayout());
        //Se crean los botones que serán agregados al contenedor
        JButton btnA =  new JButton("boton A");
        JButton btnB =  new JButton("boton B");
        JButton btnC =  new JButton("boton C");
        JButton btnD =  new JButton("boton D");
        JButton btnE =  new JButton("boton E");
        JButton btnF =  new JButton("boton F");
        
        //Se agregan los componentes al contenedor, estos se acomodan conforme fueron ordenados en el código
        panelB.add(btnA);
        panelB.add(btnB);
        panelB.add(btnC);
        panelB.add(btnD);
        panelB.add(btnE);
        panelB.add(btnF);
        
        getContentPane ().add(panelA);
        getContentPane ().add(panelB);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MiVentana();
    }
    
}
