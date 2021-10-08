package com.example.lib;

import java.util.HashSet;
import java.util.Set;

public class Unidades {
    //static= variable global(siempre vale lo mismo(si cambia uno, también el resto)).
    static int NUMEROS[]={7, 77,21, 28, 48, 42, 49, 56, 62, 70};


    public static void main (String[] args){
        Set <Integer> unidades= new HashSet<>();
        for(int n=0;n<NUMEROS.length;n++){
            unidades.add(NUMEROS[n]%10);

        }
        System.out.println(unidades.toString());

    }

}
