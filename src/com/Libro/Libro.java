package com.Libro;

public class Libro {
    private String TituloLibro;
    private double PrecioLibro;
    private int StockLibro;
    private Autor AutorLibro;

    public Libro(){
        this.TituloLibro="";
        this.PrecioLibro=0;
        this.StockLibro=0;
        this.AutorLibro=new Autor();
    }
    public Libro(String tituloLibro, double precioLibro, int stockLibro, Autor autorLibro){
        this.TituloLibro=tituloLibro;
        this.PrecioLibro=precioLibro;
        this.StockLibro=stockLibro;
        this.AutorLibro=autorLibro;
    }

    public void agregarStock(int cantidadAgregada){
        this.StockLibro=this.StockLibro+cantidadAgregada;
    }

    public void verLibro(){
        System.out.println("Titulo: "+this.TituloLibro+", Autor:"+this.AutorLibro.getNombreAutor()+" "+this.AutorLibro.getApellidoAutor()+", Precio: $"+this.PrecioLibro+", Stock: "+this.StockLibro);
    }

    public void publicacionVenta(){
        System.out.println("El Libro: "+this.TituloLibro+" De "+this.AutorLibro.getNombreAutor()+" "+this.AutorLibro.getApellidoAutor()+", Se Vende a: $"+this.PrecioLibro);
    }

    public String getTituloLibro() {
        return TituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        TituloLibro = tituloLibro;
    }

    public double getPrecioLibro() {
        return PrecioLibro;
    }

    public void setPrecioLibro(double precioLibro) {
        PrecioLibro = precioLibro;
    }

    public int getStockLibro() {
        return StockLibro;
    }

    public void setStockLibro(int stockLibro) {
        StockLibro = stockLibro;
    }

    public Autor getAutorLibro() {
        return AutorLibro;
    }

    public void setAutorLibro(Autor autorLibro) {
        AutorLibro = autorLibro;
    }


}
