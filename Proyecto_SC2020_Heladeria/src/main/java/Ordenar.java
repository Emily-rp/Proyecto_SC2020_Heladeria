
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

    CatalogoOrdenar catalogo1 = new CatalogoOrdenar();
    RegistroCliente registro1 = new RegistroCliente();

    public void menu() {

        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Binevenido(a) a Dulce Tropic"
                    + "\nAproveche nuestras ofertas para quienes formen parte de la familia Dulce Tropic"
                    + "\n\nDigite la opción que desea realizar"
                    + "\n1.Iniciar sesion "
                    + "\n2.Registrarse "
                    + "\n3.Ingresar como invitado"
                    + "\n0.Salir"));

            switch (opcion) {
                case 1:
                    registro1.iniciarSesion();
                    break;
                case 2:
                    registro1.registrar();
                    JOptionPane.showMessageDialog(null, "Su registro se realizó, ya puede iniciar sesión");

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Bienvenido al menú de invitado, recuerde que "
                            + "al registrarse tendra beneficios de cliente frecuente");
                    catalogo1.Ordenar();
                    break;
            }

        } while (opcion != 0);
    }

}
