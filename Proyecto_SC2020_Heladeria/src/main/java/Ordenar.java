
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emily
 */
public class Ordenar {
  
public void menu(){
    MenuRestaurante menuR = new MenuRestaurante();
    
    int opcion = 0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
            "Binevenido(a) a Dulce tropic"+ 
            "\nTenemos ofertas para quienes se registren"+
            "\n\nDigite la opcion que desea realizar"+
            "\n1.Iniciar sesion "+
            "\n2.Registrarse "+
            "\n3.Ingresar como invitado"+
            "\n0.Salir"));
            
            switch(opcion){
                case 1:
                    
                break;
                case 2:
                    
                    
                break;
                case 3:
                    
                break;       
            }
            
    }while(opcion!=0);
   }

}
