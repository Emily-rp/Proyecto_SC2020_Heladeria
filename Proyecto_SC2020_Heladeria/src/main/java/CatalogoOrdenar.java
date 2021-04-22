
import java.util.Scanner;
import javax.swing.JOptionPane;

//este sera donde se muestre el menu para ordenar los helados
public class CatalogoOrdenar {
    public static void main(String[]args){
        int opcion=0; String op=""; 
        Scanner LeerPrecios= new Scanner(System.in); int a = 0;
            op=JOptionPane.showInputDialog("ESCOGE A TU PREFERENCIA:\n"
                                        + "1.Helado \n"
                                        + "2.Sundae\n"
                                        + "3.Crepas\n"
                                        + "4.Cono\n"
                                        + "5.salir\n");    
                              opcion=Integer.parseInt(op);
                              switch(opcion){
                                  case 1: JOptionPane.showMessageDialog(null,"Escoge tu helado. "); 
                                     op=JOptionPane.showInputDialog("Escoge el sabor de tu helado a tú prefencia:\n"
                                             +"1- Helado m&m ₡2000 \n"
                                             +"2- Helado Oreo ₡2000\n"
                                             +"3- Helado Chicle ₡2000\n"
                                             +"4-Helado light ₡2500\n"
                                              +"5-Vuelve al menú Principal\n");
                                             
                                     if( a == 1){    
                                        a = 2000;
                                        if (a==1){
                                            a =2000;
                                            }else if (a==2) {
                                                      a= 3000;
                                        
                                     }
                                     
                                         

                                             
                                             
                                         
                                     
                                    
                                  
                                  
                                  case 2: JOptionPane.showInternalMessageDialog(null, "Escoge un Sunday a tu preferencia");
                                        op=JOptionPane.showInputDialog("Escoge entre diferentes sabores tú Sundae:\n"
                                                + "1.Fresa ₡2000\n"
                                                + "2.vainilla ₡2000\n"
                                                + "3.chocolate ₡2000\n"
                                                + "4.caramelo ₡2000\n"
                                                + "5.Salir");
                                                
                                  
                                  case 3: JOptionPane.showMessageDialog(null, "Escoge el Sabor de Crepa"); 
                                    op=JOptionPane.showInputDialog("Escoge entre diferentes sabores de crepas:\n"
                                            +"1- Dulce tentación ₡3000\n"
                                            +"2- frutos del bosque ₡3000\n"
                                            +"3- Manzana ₡2000\n" 
                                            +"4- Caribean Style ₡2500\n"
                                            +"5- Volver al menú\n");
                                            
                                  case 4: JOptionPane.showInternalMessageDialog(null, "Escoge el sabor de tu cono"); 
                                    op=JOptionPane.showInputDialog("Que sabor deseas tu Cono\n"
                                            +"1.Fresa ₡1000\n"
                                            +"2.Vainilla ₡1000\n"
                                            +"3.Chocolate ₡1000\n"
                                            +"4.Caramelo ₡1000\n"
                                            +"5.Oreo ₡1000\n"
                                            +"6.Salir\n");
                                  
                                  case 5: JOptionPane.showInternalMessageDialog(null, "Salir del menú"); break;  }   
    }
    
    
    
}
