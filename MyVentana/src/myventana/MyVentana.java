package myventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyVentana extends JFrame {
    JLabel lblTitle;
    JTextField txtTitle;
    JButton btn;
    
    public MyVentana() {
        setTitle("Manipulando componente");
        setSize(550,500);
        setLocationRelativeTo(null);
        setLayout(null);
        
        lblTitle = new JLabel("Titulo de la ventana");
        lblTitle.setBounds(10,10,480,30);
                
        txtTitle = new JTextField();
        txtTitle.setBounds(10,10,480,40);
        
        btn = new JButton("Definir nuevo titulo");
        btn.setBounds(10,90,480,40);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String title =txtTitle.getText();
                    setTitle(title);
            }
            });
        
        getContentPane().add(lblTitle);
        getContentPane().add(txtTitle);
        getContentPane().add(btn);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) throws Exception {
        
        String str = "com.jtattoo.plaf.hifi.HiFiLookAndFeel";
        
        UIManager.setLookAndFeel(str);
                
        new MyVentana();
        

    }
    
}

