
import javax.swing.JOptionPane;

//este sera donde se muestre el menu para ordenar los helados
public class CatalogoOrdenar {
    
    
    int option = 0;
    do  {  
    opcion = Interguer.ParseInt(JOptionPane.showInputDialog(
                         "Bienvenido a Dulce Tropic"
                         + "\nTienes la opcion de elegir entre los Sunday y los Helados"
                         + "\n\nDigite la opción que desea realizar"
                         + "\n1.Sunday "
                         + "\n2.Helado "
                         + "\n0.Salir"));    
                              
                        
    
}

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }
    
}
