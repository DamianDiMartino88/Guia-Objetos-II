package com.company;

import com.Cuenta.Cuenta;
import com.Libro.Autor;
import com.Libro.Libro;
import com.Ventas.Cliente;
import com.Ventas.Factura;
import com.Ventas.ItemVenta;
import jdk.nashorn.api.tree.FunctionCallTree;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Ejercicio 1
        Autor JB= new Autor("Joshua","Bloch","joshua@email.com","M");
        JB.verAutor();
        Libro EfJava = new Libro("Effective Java",450,150,JB);
        EfJava.verLibro();
        EfJava.setPrecioLibro(500);
        EfJava.agregarStock(50);
        EfJava.verLibro();
        EfJava.getAutorLibro().verAutor();
        EfJava.publicacionVenta();

        System.out.println(" ");
        System.out.println(" -------------------------------------------------------- ");
        System.out.println(" ");

        //Ejercicio 2
        Cliente clienteNuevo = new Cliente("Juan Perez","elmaildejuan@email.com",13);
        ItemVenta itemVenta1 = new ItemVenta("Tuerca","Tuerca del 6",25,1.05);
        ItemVenta itemVenta2 = new ItemVenta("Tornillo","Tornillo del 6",25,2.25);
        ItemVenta itemVenta3 = new ItemVenta("Llave Fija","Llave Fija N° 6",1,53);
        ItemVenta itemVenta4 = new ItemVenta("Llave Francesa", "Llave Francesa N°2 ",1,84);
        Factura nuevaFactura = new Factura(clienteNuevo);
        nuevaFactura.agregarItem(itemVenta1);
        nuevaFactura.agregarItem(itemVenta2);
        nuevaFactura.agregarItem(itemVenta3);
        nuevaFactura.agregarItem(itemVenta4);

        nuevaFactura.verFactura();

        System.out.println(" ");
        System.out.println(" -------------------------------------------------------- ");
        System.out.println(" ");

        //Ejercicio 3
        com.Cuenta.Cliente nuevoCliente = new com.Cuenta.Cliente("Juan Perez","M");
        nuevoCliente.verCliente();
        Cuenta nuevaCuenta = new Cuenta(3,10000,nuevoCliente);
        nuevaCuenta.depositar(5000);
        nuevaCuenta.extraer(16900);
        nuevaCuenta.depositar(3000);
        nuevaCuenta.depositar(6000);
        nuevaCuenta.extraer(3000);
        nuevaCuenta.depositar(5000);
        nuevaCuenta.extraer(1900);
        nuevaCuenta.depositar(8000);
        nuevaCuenta.extraer(2500);
        nuevaCuenta.extraer(900);
        nuevaCuenta.verOperaciones();


    }
}
