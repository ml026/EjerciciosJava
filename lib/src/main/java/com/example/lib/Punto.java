package com.example.lib;

import java.util.ArrayList;
import java.util.List;

public class Punto {
    private double x;
    private double y;


    //Constructor
    public Punto (double x,double y){
        this.x=x;
        this.y=y;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double getY() {
        return y;
    }

    public double distancia(Punto p) {
        return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
    }
    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static  void main(String[] args){
        List<Punto> poligono=new ArrayList<>();
        poligono.add(new Punto(0,1));
        poligono.add(new Punto(2,0));

        //Así con el resto
        double perimetro=0;
        for (int n=0;n<=poligono.size()-1;n++){
            if (n<poligono.size()-1){
                //Acumulador sobre la misma variable (perimetro=perimetro+...)
                perimetro+=poligono.get(n).distancia(poligono.get(n+1));
            }
            else{
                perimetro+=poligono.get(n).distancia(poligono.get(0));
            }
        }
        System.out.println("perimetro"+perimetro);
        System.out.println("lado medio"+perimetro / poligono.size());
    }

}
