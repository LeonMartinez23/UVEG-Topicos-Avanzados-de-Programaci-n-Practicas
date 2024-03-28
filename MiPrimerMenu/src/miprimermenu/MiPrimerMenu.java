package miprimermenu;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MiPrimerMenu extends JFrame{
    public MiPrimerMenu(){
        super("Mi Ventana");
        setSize(1000,700);
        setLocationRelativeTo(null);
        
        //Primer Item creando los elementos de la opcion "Archivo"
        JMenuItem itemNew = new JMenuItem("Nuevo");
        JMenuItem itemEdit = new JMenuItem("Editar");
        JMenuItem itemClose = new JMenuItem("Cerrar");
        
        //Crea la opcion Archivo
        JMenu menuFile = new JMenu("Archivo");
        
        //Agrega las subopciones
        menuFile.add(itemNew);
        menuFile.add(itemEdit);
        menuFile.add(itemClose);
        
        //Segundo Item creando los elementos de la opcion "Ver"
        JMenuItem itemZoomOFF = new JMenuItem("Alejar");
        JMenuItem itemZoomIn = new JMenuItem("Acercar");
        
        //Crea la opcion Ver
        JMenu menuView = new JMenu("Ver");
        
        //Agrega las subopciones
        menuView.add(itemZoomOFF);
        menuView.add(itemZoomIn);
        
        //Tercer Item creando los elementos de la opcion "Ayuda"
        JMenuItem itemAbout = new JMenuItem("Acerca de...");
        
        //Crea la opcion Ayuda
        JMenu menuHelp = new JMenu("Ayuda");
        
        //Agrega las subopciones
        menuHelp.add(itemAbout);
        
        //Crea la barra del menu
        JMenuBar barMenu = new JMenuBar();
        
        //Agrega las opciones a la barra del menu
        barMenu.add(menuFile);
        barMenu.add(menuView);
        barMenu.add(menuHelp);
        
        //Agrega el menú a la ventana mediante el método setJMenuBar.
        setJMenuBar(barMenu);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new MiPrimerMenu();
    }
    
}
