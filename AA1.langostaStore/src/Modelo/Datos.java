package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Datos {

    private List<Cliente> datosCliente = new ArrayList<>();

    public boolean agregarCliente(Cliente cliente) {
        datosCliente.add(cliente);
        return true;
    }

    public List<Cliente> obtenerClientes() {
        return datosCliente;
    }
}
