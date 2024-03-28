package miventana2;
import javax.swing.JFrame;

public class MiVentana2 extends JFrame{
    
    public MiVentana2(){
        super("Mi ventada");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new MiVentana2();
    }
    
}
