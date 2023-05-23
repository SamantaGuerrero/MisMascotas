package com.example.mismascotasrecycler;

public class ListElement {
    private String mascota;
    private String nombre;
    private String raza;
    private int foto;

    public ListElement(int foto, String mascota, String nombre, String raza) {
        this.foto = foto;
        this.mascota = mascota;
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getFoto() {return foto;}

    public void setFoto(int foto) {this.foto = foto;}
}
