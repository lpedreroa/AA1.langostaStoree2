package Controlador;


import Modelo.Cliente;
import Modelo.Datos;
import Vista.InterfazView;

import java.util.List;

public class ClienteController {
    public static void main (String [] args) {
        InterfazView vista = new InterfazView();
        Datos bbdd = new Datos();

        int opc = 0;

        do{
            opc = vista.menu();

            switch (opc) {
                case 1:
                    Cliente cliente = vista.lecturaCliente();
                    bbdd.addCliente(cliente);
                    break;
                case 2:
                    List<Cliente> datos = bbdd.getClientes();
                    //bbdd.
                    vista.mostrarClientes(datos);
                    break;
                default:

            }
        }while(opc!=3);

    }


}
