package miprimerscroll;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MiPrimerScroll extends JFrame{
    public MiPrimerScroll() {
    super("Mi Ventana");
        setSize(400,400);
        setLocationRelativeTo(null);
        setLayout(null);
        
        JTextArea area = new JTextArea();
        area.setLineWrap(true);
        
        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(10,10,380,360);
        
        getContentPane().add(scroll);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    
    }

    public static void main(String[] args) {
        new MiPrimerScroll();
    }
    
}
