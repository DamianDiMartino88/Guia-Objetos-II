package com.Libro;

public class Autor {
    private String NombreAutor;
    private String ApellidoAutor;
    private String EmailAutor;
    private String GeneroAutor;

    public Autor() {
        this.NombreAutor = "";
        this.ApellidoAutor = "";
        this.EmailAutor = "";
        this.GeneroAutor ="";
    }

    public Autor(String nombreAutor, String apellidoAutor, String emailAutor, String generoAutor) {
        this.NombreAutor = nombreAutor;
        this.ApellidoAutor = apellidoAutor;
        this.EmailAutor = emailAutor;
        this.GeneroAutor = generoAutor;
    }

    public void verAutor() {
        System.out.println("Autor: " + this.NombreAutor + " " + this.ApellidoAutor + ", Email: " + this.EmailAutor + ", " + ((this.GeneroAutor == "M") ? "Masculino" : "Femenino"));
    }

    public String getNombreAutor() {
        return NombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        NombreAutor = nombreAutor;
    }

    public String getApellidoAutor() {
        return ApellidoAutor;
    }

    public void setApellidoAutor(String apellidoAutor) {
        ApellidoAutor = apellidoAutor;
    }

    public String getEmailAutor() {
        return EmailAutor;
    }

    public void setEmailAutor(String emailAutor) {
        EmailAutor = emailAutor;
    }

    public String getGeneroAutor() {
        return GeneroAutor;
    }

    public void setGeneroAutor(String generoAutor) {
        GeneroAutor = generoAutor;
    }

}

