package Vista;

import Modelo.Cliente;

import java.util.List;
import java.util.Scanner;

public class InterfazView {

    public int menu() {
        int opc = 0;
        System.out.println("Menu");
        System.out.println("1 Agregar cliente");
        System.out.println("2 Ver clientes");
        System.out.println("3 Salir");

        opc = new Scanner(System.in).nextInt();

        return opc;
    }

    public Cliente lecturaCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NIF:");
        String nif = sc.nextLine();
        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        System.out.println("e-mail:");
        String email = sc.nextLine();
        System.out.println("Domicilio:");
        String domicilio = sc.nextLine();

        return new Cliente(email, nombre, domicilio, nif);

    }

    public void mostrarClientes(List<Cliente> clienteLista) {
        System.out.println("CLIENTES");
        for (Cliente cliente: clienteLista){
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("NIF: " + cliente.getNif());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Vive en: " + cliente.getDomicilio());
        }
    }

}
