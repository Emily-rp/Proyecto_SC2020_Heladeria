
import javax.swing.JOptionPane;

//este sera donde se muestre el menu para ordenar los helados
public class CatalogoOrdenar {
    public static void main(String[]args){
        int opcion=0; String op="";
            op=JOptionPane.showInputDialog("ESCOGE A TU PREFERENCIA:\n"
                                        + "1.Helado \n"
                                        + "2.Sunday\n"
                                        + "3.Crepas\n"
                                        + "4.Cono\n"
                                        + "5.salir\n");    
                              opcion=Integer.parseInt(op);
                              switch(opcion){
                                  case 1: JOptionPane.showMessageDialog(null,"Escoge tu helado. "); 
                                     op=JOptionPane.showInputDialog("Escoge el sabor de tu helado a tú prefencia:\n"
                                             +"1- Helado m&m\n"
                                             +"2- Helado Oreo\n"
                                             +"3- Helado Chicle\n"
                                             +"4-Helado light\n"
                                             +"5-Arma a tu gusto\n"
                                             +"6-Vuelve al menú Principal\n");
                                  
                                  
                                  case 2: JOptionPane.showInternalMessageDialog(null, "Escoge un Sunday a tu preferencia"); break;
                                  case 3: JOptionPane.showMessageDialog(null, "Escoge el Sabor de Crepa"); break;
                                  case 4: JOptionPane.showInternalMessageDialog(null, "Escoge el sabor de tu cono"); break;
                                  case 5: JOptionPane.showInternalMessageDialog(null, "Salir del menú"); break;  }   
    }
    
    
    
}
