package com.example.android.personas;


/**
 * Created by android on 19/09/2017.
 */

public class persona {
    private String cc;
    private String nombre;
    private String apellido;

    public persona(String cc, String nombre, String apellido) {
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void guardar (){
        datos.guardar(this);
    }
}
