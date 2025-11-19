package com.clases;

public class Rectangulo {
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularPerimetro(){
        double perimetro = (2*this.base)+(2*this.altura);
        return perimetro;
    }
}
