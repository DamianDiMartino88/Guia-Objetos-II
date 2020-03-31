package com.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
       private int TipoDeCuenta;
       private double BalanceDeCuenta;
       private Cliente ClienteDeCuenta;
       private List<String> Operaciones;

     public Cuenta(){
         this.TipoDeCuenta=0;
         this.BalanceDeCuenta=0;
         this.ClienteDeCuenta=new Cliente();
         this.Operaciones = new ArrayList<>();
     }

     public Cuenta(int tipoDeCuenta, double balanceDeCuenta, Cliente clienteDeCuenta){
         this.TipoDeCuenta=tipoDeCuenta;
         this.BalanceDeCuenta=balanceDeCuenta;
         this.ClienteDeCuenta=clienteDeCuenta;
         this.Operaciones = new ArrayList<>();
     }

     public void depositar(double deposito){
         this.BalanceDeCuenta=this.BalanceDeCuenta+deposito;
         Operaciones.add("El Cliente "+this.ClienteDeCuenta.getNombreCliente()+" Deposito: $"+deposito);
         System.out.println("El Saldo Actual es de: $"+this.BalanceDeCuenta);
     }

     public void extraer(double extraccion){
         if(this.TipoDeCuenta==3||this.TipoDeCuenta==4){
             if((this.BalanceDeCuenta-extraccion)<-2000){
                 System.out.println("La Operacion No puede Realizarse");
             }else if((this.BalanceDeCuenta-extraccion)>=-2000&&(this.BalanceDeCuenta-extraccion)<0){
                 this.BalanceDeCuenta=this.BalanceDeCuenta-extraccion;
                 Operaciones.add("El Cliente "+this.ClienteDeCuenta.getNombreCliente()+" Extrajo: $"+extraccion);
                 System.out.println("Cuenta Preferencial, Saldo Deudor Permitido: -$2000");
             }else{
                 this.BalanceDeCuenta=this.BalanceDeCuenta-extraccion;
                 Operaciones.add("El Cliente "+this.ClienteDeCuenta.getNombreCliente()+" Extrajo: $"+extraccion);
             }
         }else if((this.BalanceDeCuenta-extraccion)<0){
             System.out.println("La Operacion No puede Realizarse");
         }else {

             System.out.println();
             this.BalanceDeCuenta = this.BalanceDeCuenta - extraccion;
             Operaciones.add("El Cliente "+this.ClienteDeCuenta.getNombreCliente()+" Extrajo: $"+extraccion);

         }
         System.out.println(1234);
         System.out.println("El Saldo Actual es de: $"+this.BalanceDeCuenta);
     }

     public void verOperaciones(){
         for (String operacion:this.Operaciones) {
             System.out.println(operacion);
         }
     }

     public int getTipoDeCuenta() {
         return TipoDeCuenta;
     }

     public void setTipoDeCuenta(int tipoDeCuenta) {
         TipoDeCuenta = tipoDeCuenta;
     }

     public double getBalanceDeCuenta() {
         return BalanceDeCuenta;
     }

     public void setBalanceDeCuenta(double balanceDeCuenta) {
         BalanceDeCuenta = balanceDeCuenta;
     }

     public Cliente getClienteDeCuenta() {
         return ClienteDeCuenta;
     }

     public void setClienteDeCuenta(Cliente clienteDeCuenta) {
         ClienteDeCuenta = clienteDeCuenta;
     }

    public List<String> getOperaciones() {
        return Operaciones;
    }

    public void setOperaciones(List<String> operaciones) {
        Operaciones = operaciones;
    }
}
