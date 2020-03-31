package com.Ventas;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Factura {
    private String IdFactura;
    private double MontoFactura;
    private LocalDate FechaFactura;
    private Cliente ClienteFactura;
    private List<ItemVenta> ListaItemsFactura;

    public Factura(){
        SecureRandom random = new SecureRandom();
        this.IdFactura = new BigInteger(60, random).toString(32);
        this.MontoFactura=0;
        this.FechaFactura=LocalDate.now();
        this.ClienteFactura= new Cliente();
        this.ListaItemsFactura = new ArrayList<>();
    }

    public Factura(Cliente clienteFactura){
        SecureRandom random = new SecureRandom();
        this.IdFactura = new BigInteger(60, random).toString(32);
        this.MontoFactura=0;
        this.FechaFactura=LocalDate.now();
        this.ClienteFactura= clienteFactura;
        this.ListaItemsFactura = new ArrayList<>();
    }

    public void agregarItem(ItemVenta nuevoItem){
        this.ListaItemsFactura.add(nuevoItem);
    }

    public void listaItems(){
        for (ItemVenta item: this.ListaItemsFactura) {
            System.out.println("Item: "+item.getDescripcionItemVenta()+" Cantidad: "+item.getCantidadItemVenta()+" Precio: $"+item.getPrecioItemVenta());
        }
    }

    public void calcularTotal(){
        double total=0;
        for (ItemVenta item: this.ListaItemsFactura) {
            total=total+(item.getPrecioItemVenta()*item.getCantidadItemVenta());
        }
        System.out.println((this.ClienteFactura.getDescuentoCliente()>0)?"Total Factura: $"+total+" Descuento cliente: %"
                +this.ClienteFactura.getDescuentoCliente()+" Valor Final: $"+(total*(1-(this.ClienteFactura.getDescuentoCliente()/100)))
                :"Total Factura: $"+total);
    }

    public void verFactura(){
        System.out.println("Cliente:");
        System.out.println("ID: "+this.ClienteFactura.getIdCliente()+" | Nombre: "+this.ClienteFactura.getNombreCliente());
        System.out.println("Email: "+this.ClienteFactura.getEmailCliente());
        System.out.println("Datos Venta:");
        System.out.println("Fecha: "+this.FechaFactura);
        System.out.println("Detalle:");
        this.listaItems();
        this.calcularTotal();
    }

    public String getIdFactura() {
        return IdFactura;
    }

    public double getMontoFactura() {
        return MontoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        MontoFactura = montoFactura;
    }

    public LocalDate getFechaFactura() {
        return FechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        FechaFactura = fechaFactura;
    }

    public Cliente getClienteFactura() {
        return ClienteFactura;
    }

    public void setClienteFactura(Cliente clienteFactura) {
        ClienteFactura = clienteFactura;
    }

    public List<ItemVenta> getListaItemsFactura() {
        return ListaItemsFactura;
    }

    public void setListaItemsFactura(List<ItemVenta> listaItemsFactura) {
        ListaItemsFactura = listaItemsFactura;
    }
}
