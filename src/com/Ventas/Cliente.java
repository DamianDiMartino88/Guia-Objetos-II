package com.Ventas;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.UUID;

public class Cliente {
    private String IdCliente;
    private String NombreCliente;
    private String EmailCliente;
    private double DescuentoCliente;

    public Cliente(){
        SecureRandom random = new SecureRandom();
        this.IdCliente = new BigInteger(60, random).toString(32);
        this.NombreCliente="";
        this.EmailCliente="";
        this.DescuentoCliente=0;
    }

    public Cliente(String nombreCliente, String emailCliente, double descuentoCliente){
        SecureRandom random = new SecureRandom();
        this.IdCliente = new BigInteger(60, random).toString(32);
        this.NombreCliente=nombreCliente;
        this.EmailCliente=emailCliente;
        this.DescuentoCliente=descuentoCliente;
    }

    public void verCliente(){
        System.out.println("Id Cliente: "+this.IdCliente+", Nombre Cliente: "+this.NombreCliente+", Email: "+this.EmailCliente+", Descuento: %"+this.DescuentoCliente);
    }

    public String getIdCliente() {
        return IdCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public String getEmailCliente() {
        return EmailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        EmailCliente = emailCliente;
    }

    public double getDescuentoCliente() {
        return DescuentoCliente;
    }

    public void setDescuentoCliente(double descuentoCliente) {
        DescuentoCliente = descuentoCliente;
    }
}
