package com.example.android.personas;

import java.util.ArrayList;

/**
 * Created by android on 19/09/2017.
 */

public class datos {
    private static ArrayList<persona> personas = new ArrayList<>();

    public static void guardar(persona p){
        personas.add(p);
    }

    public static  ArrayList<persona> obtener(){
       return personas;
    }
}
