package com.cmc.evaluacion;

public class CalculadoraAmortizacion {

    public static double calcularCuota(Prestamo prestamo){
        double interes = (prestamo.getInteres()/12)/100;
        double cuota = ((prestamo.getMonto() * interes))/(1 - Math.pow(1 + interes, -12));
        return cuota;

    }
}
