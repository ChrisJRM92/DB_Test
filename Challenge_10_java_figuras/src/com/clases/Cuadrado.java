package com.clases;

public class Cuadrado {
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        double area = this.lado*this.lado;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro = this.lado*4;
        return perimetro;
    }
}
