package com.Cuenta;

public class Cliente {
    private int CantidadClientes=0;
    private int IdCliente;
    private String NombreCliente;
    private String GeneroCliente;

    public Cliente(){
        CantidadClientes++;
        this.IdCliente=this.CantidadClientes;
        this.NombreCliente="";
        this.GeneroCliente="";
    }

    public Cliente(String nombreCliente, String generoCliente){
        CantidadClientes++;
        this.IdCliente=this.CantidadClientes;
        this.NombreCliente=nombreCliente;
        this.GeneroCliente=generoCliente;
    }

    public void verCliente(){
        System.out.println("Nombre: "+this.NombreCliente+" Numero de Cliente: "+this.IdCliente+" Genero: "+((this.GeneroCliente == "M") ? "Masculino" : "Femenino"));
    }

    public int getCantidadClientes() {
        return CantidadClientes;
    }

    public void setCantidadClientes(int cantidadClientes) {
        CantidadClientes = cantidadClientes;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public String getGeneroCliente() {
        return GeneroCliente;
    }

    public void setGeneroCliente(String generoCliente) {
        GeneroCliente = generoCliente;
    }
}
