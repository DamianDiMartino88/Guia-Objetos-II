package com.Ventas;

import java.math.BigInteger;
import java.security.SecureRandom;

public class ItemVenta {
    private String IdItemVenta;
    private String NombreItemVenta;
    private String DescripcionItemVenta;
    private int CantidadItemVenta;
    private double PrecioItemVenta;

    public ItemVenta()
    {
        SecureRandom random = new SecureRandom();
        this.IdItemVenta= new BigInteger(30,random).toString(32);
        this.NombreItemVenta=" ";
        this.DescripcionItemVenta=" ";
        this.CantidadItemVenta=0;
        this.PrecioItemVenta=0;
    }

    public ItemVenta(String nombreItemVenta, String descripcionItemVenta, int cantidadItemVenta, double precioItemVenta)
    {
        SecureRandom random = new SecureRandom();
        this.IdItemVenta= new BigInteger(30,random).toString(32);
        this.NombreItemVenta=nombreItemVenta;
        this.DescripcionItemVenta=descripcionItemVenta;
        this.CantidadItemVenta=cantidadItemVenta;
        this.PrecioItemVenta=precioItemVenta;
    }

    public String getIdItemVenta() {
        return IdItemVenta;
    }


    public String getNombreItemVenta() {
        return NombreItemVenta;
    }

    public void setNombreItemVenta(String nombreItemVenta) {
        NombreItemVenta = nombreItemVenta;
    }

    public String getDescripcionItemVenta() {
        return DescripcionItemVenta;
    }

    public void setDescripcionItemVenta(String descripcionItemVenta) {
        DescripcionItemVenta = descripcionItemVenta;
    }

    public int getCantidadItemVenta() {
        return CantidadItemVenta;
    }

    public void setCantidadItemVenta(int cantidadItemVenta) {
        CantidadItemVenta = cantidadItemVenta;
    }

    public double getPrecioItemVenta() {
        return PrecioItemVenta;
    }

    public void setPrecioItemVenta(double precioItemVenta) {
        PrecioItemVenta = precioItemVenta;
    }
}
