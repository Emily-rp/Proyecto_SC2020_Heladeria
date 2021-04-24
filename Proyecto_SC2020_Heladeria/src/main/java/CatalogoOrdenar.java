
import java.util.Scanner;
import javax.swing.JOptionPane;

//este sera donde se muestre el menu para ordenar los helados
public class CatalogoOrdenar {

    public void Ordenar() {
        int opcion = 0;
        String op = "";
        Scanner LeerPrecios = new Scanner(System.in);
        int a;
        op = JOptionPane.showInputDialog("ESCOGE A TU PREFERENCIA:\n"
                + "1.Helado \n"
                + "2.Sundae\n"
                + "3.Crepas\n"
                + "4.Cono\n"
                + "5.salir\n");
        opcion = Integer.parseInt(op);
        switch (opcion) {
            case 1:
                JOptionPane.showMessageDialog(null, "Escoge tu helado. ");

                int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escoge el sabor de tu helado a tú prefencia:\n"
                        + "1- Helado m&m ₡2000 \n"
                        + "2- Helado Oreo ₡2000\n"
                        + "3- Helado Chicle ₡2500\n"
                        + "4-Helado light ₡2000\n"
                        + "5-Salir del menú Principal\n"));

                if (numero1 == 1) {
                    numero1 = 2000;
                    JOptionPane.showMessageDialog(null, "Su precio es de " + numero1);
                } else if (numero1 == 2) {
                    numero1 = 2000;
                    JOptionPane.showMessageDialog(null, "su precio es de" + numero1);
                } else if (numero1 == 3) {
                    numero1 = 2500;
                    JOptionPane.showMessageDialog(null, "su precio es de" + numero1);
                } else if (numero1 == 4) {
                    numero1 = 2000;
                    JOptionPane.showMessageDialog(null, "su precio es de" + numero1);
                }

            case 2:
                JOptionPane.showInternalMessageDialog(null, "Escoge un Sundae a tu preferencia");
                int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escoge entre diferentes sabores tú Sundae:\n"
                        + "1.Fresa ₡2000\n"
                        + "2.vainilla ₡2000\n"
                        + "3.chocolate ₡2000\n"
                        + "4.caramelo ₡2000\n"
                        + "5.Salir\n"));
                if (numero2 == 1) {
                    numero2 = 2000;
                    JOptionPane.showMessageDialog(null, "Su precio es de " + numero2);
                } else if (numero2 == 2) {
                    numero2 = 2000;
                    JOptionPane.showMessageDialog(null, "su precio es de" + numero2);
                } else if (numero2 == 3) {
                    numero2 = 2000;
                    JOptionPane.showMessageDialog(null, " Su precio es de " + numero2);
                } else if (numero2 == 4) {
                    numero2 = 2000;
                }
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Escoge el Sabor de Crepa");
                int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Escoge entre diferentes sabores de crepas:\n"
                        + "1- Dulce tentación ₡3000\n"
                        + "2- frutos del bosque ₡3000\n"
                        + "3- Manzana ₡2000\n"
                        + "4- Caribean Style ₡2500\n"
                        + "5- salir del menu"
                       ));
                if (numero3 == 1) {
                    numero3 = 3000;
                    JOptionPane.showMessageDialog(null, "Su precio es de " + numero3);
                } else if (numero3 == 2) {
                    numero3 = 3000;
                    JOptionPane.showMessageDialog(null, "su precio es de" + numero3);
                } else if (numero3 == 3) {
                    numero3 = 2000;
                    JOptionPane.showMessageDialog(null, " Su precio es de " + numero3);
                } else if (numero3 == 4) {
                    numero3 = 2500;
                }
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Escoge el sabor de tu cono");
                int numero4 = Integer.parseInt(JOptionPane.showInputDialog("Que sabor deseas tu Cono\n"
                        + "1.Fresa ₡1000\n"
                        + "2.Chocolate ₡1000\n"
                        + "3.Caramelo ₡1700\n"
                        + "4.Oreo ₡1500\n"
                        + "Salir\n"));
                if (numero4 == 1) {
                    numero4 = 1000;
                    JOptionPane.showMessageDialog(null, "Su precio es de " + numero4);
                } else if (numero4 == 2) {
                    numero4 = 1000;
                    JOptionPane.showMessageDialog(null, "su precio es de" + numero4);
                } else if (numero4 == 3) {
                    numero4 = 1700;
                    JOptionPane.showMessageDialog(null, " Su precio es de " + numero4);
                } else if (numero4 == 4) {
                    numero4 = 1500;
                }
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Salir del menú");
                break;
        }
    }

}
