
import javax.swing.JOptionPane;

/*
Esta en la primera pagina a mostrar en la cual el usuario eligirá si desea continuar
cómo adminitrador o puede realizar un pedido.

aquí se realizará un ciclo While para entrar a un menú y con un 
Swith se elegirá entre tres ociones:
1- Ordenar
2- Entrar como adminitrador
0- Salir
*/



public class MenuPrincipal {

    public static void main(String[] args) {
        
        int opcion = 0;
        while (opcion !=0){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Bienvenido a la Heladeria "
                     + "Digite la opción que desea realizar"
                     + "\n1. Ordenar"
                     + "\n2.Entrar como administrador"
                     + "\n0. Salir"));
            switch (opcion){
                case 1:
                case 2:    
            }         
            
    }// fin ciclo while
        
        
        
        
        
    }// fin main
    
}// fin class MenuPrincipal