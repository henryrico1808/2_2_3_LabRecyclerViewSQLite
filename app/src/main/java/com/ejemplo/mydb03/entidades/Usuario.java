package com.ejemplo.mydb03.entidades;

/**
 * Created by lenovo on 27/02/2018.
 */

public class Usuario {
    private int clave;
    private String nombre;
    private double sueldo;

    public Usuario(int clave, String nombre, double sueldo) {
        clave = clave;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getclave() {
        return clave;
    }

    public void setclave(int clave) {
        clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
