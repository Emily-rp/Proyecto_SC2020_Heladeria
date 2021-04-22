
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
                                     
                                         

                                             
                                             
                                         
                                     
                                    
                                  
                                  
                                  case 2: JOptionPane.showInternalMessageDialog(null, "Escoge un Sunday a tu preferencia");
                                        op=JOptionPane.showInputDialog("Escoge entre diferentes sabores tú Sunday:\n"
                                                + "1.Fresa\n"
                                                + "2.vainilla\n"
                                                + "3.chocolate\n"
                                                + "4.caramelo\n"
                                                + "5.Salir");
                                                
                                  
                                  case 3: JOptionPane.showMessageDialog(null, "Escoge el Sabor de Crepa"); 
                                    op=JOptionPane.showInputDialog("Escoge entre diferentes sabores de crepas:\n"
                                            +"1- Dulce tentación\n"
                                            +"2- frutos del bosque\n"
                                            +"3- Manzana\n" 
                                            +"4- Caribean Style\n"
                                            +"5- Volver al menú\n");
                                            
                                  case 4: JOptionPane.showInternalMessageDialog(null, "Escoge el sabor de tu cono"); 
                                    op=JOptionPane.showInputDialog("Que sabor deseas tu Cono\n"
                                            +"1.Fresa\n"
                                            +"2.Vainilla\n"
                                            +"3.Chocolate\n"
                                            +"4.Caramelo\n"
                                            +"5.Oreo\n"
                                            +"6.Salir\n");
                                  
                                  case 5: JOptionPane.showInternalMessageDialog(null, "Salir del menú"); break;  }   
    }
    
    
    
}
