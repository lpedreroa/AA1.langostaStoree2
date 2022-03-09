package Modelo;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private String nif;
    private ArrayList<Articulo> articulos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Pedido> pedidos;


    public Tienda(String nombre, String nif) {
        this.nombre=nombre;
        this.nif=nif;
        articulos = new ArrayList<Articulo>();
        clientes=new ArrayList<Cliente>();
        pedidos=new ArrayList<Pedido>();
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addArticulo(Articulo articulo){
        articulos.add(articulo);
    }
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    //faltan booleanos de encontrar pedidos etc e itinetaror//

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}

