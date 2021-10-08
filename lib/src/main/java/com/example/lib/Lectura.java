package com.example.lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jdk.internal.net.http.common.Log;

public class Lectura {
    //Atributos
    private String habitacion;
    private int temperatura;
    private long fecha;

    static long FECHA[]={1288122023000L, 1288122023000L, 1288122223000L, 1288122223000L,
            1288122223000L, 1288122623000L, 1288122623000L, 1288122623000L };
    static String HABITACION[] = {"cocina", "baño", "cocina", "baño",
            "comedor", "cocina", "baño", "comedor"};
    static int TEMPERATURA[] = {18, 19, 17, 19,
            17, 19, 22, 22};

    //Constructor


    public Lectura(String habitacion, int temperatura, long fecha) {
        this.habitacion = habitacion;
        this.temperatura = temperatura;
        this.fecha = fecha;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public static long[] getFECHA() {
        return FECHA;
    }

    public static void setFECHA(long[] FECHA) {
        Lectura.FECHA = FECHA;
    }

    public static String[] getHABITACION() {
        return HABITACION;
    }

    public static void setHABITACION(String[] HABITACION) {
        Lectura.HABITACION = HABITACION;
    }

    public static int[] getTEMPERATURA() {
        return TEMPERATURA;
    }

    public static void setTEMPERATURA(int[] TEMPERATURA) {
        Lectura.TEMPERATURA = TEMPERATURA;
    }

    public static void main (String[] args){
        List<Lectura> lecturas=new ArrayList<>();
        double contador=0;
        double total=0;
        Set <String> habitaciones= new HashSet<>();



        for(int i=0; i< HABITACION.length;i++){
            for(int j=1; j< HABITACION.length; j++){
                if(HABITACION[i] == HABITACION[j]){
                    habitaciones.remove(j);
                }
            }
        }

        System.out.println(habitaciones);




/**
        for(int i=0; i<FECHA.length;i++){
            lecturas.add(new Lectura(HABITACION[i],TEMPERATURA[i],FECHA[i] ));
        }

        for(Lectura lectura:lecturas){
            habitaciones.add(lectura.getHabitacion());
    }
        System.out.println(habitaciones.toString());
        for(String habitacion:habitaciones){
            total=0;
            contador=0;
            for (Lectura lectura:lecturas){
                if(lectura.getHabitacion().equals(habitacion)){
                    total+=lectura.getTemperatura();
                    contador++;
                }
            }
        }
    } **/
}
}



