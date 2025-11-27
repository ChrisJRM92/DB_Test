package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

import java.util.ArrayList;

public class MaquinaDulces {
    private ArrayList<Celda> celdas;
    private double saldo;

    public MaquinaDulces(){
        celdas = new ArrayList<>();
        saldo = 0;
    }

    public void agregarCelda (Celda codigo){
        celdas.add(codigo);
    }

    public void mostrarConfiguracion(){
        if (celdas.size() > 0)
            System.out.println("Celda 1: " + celdas.get(0).getCodigo());

        if (celdas.size() > 1)
            System.out.println("Celda 2: " + celdas.get(1).getCodigo());

        if (celdas.size() > 2)
            System.out.println("Celda 3: " + celdas.get(2).getCodigo());

        if (celdas.size() > 3)
            System.out.println("Celda 4: " + celdas.get(3).getCodigo());
    }

    public Celda buscarCelda(String codigo){
        if(celdas.size() > 0 && celdas.get(0).getCodigo() == codigo){
            return celdas.get(0);
        }
        if (celdas.size() > 1 && celdas.get(1).getCodigo().equals(codigo)) {
            return celdas.get(1);
        }
        if (celdas.size() > 2 && celdas.get(2).getCodigo().equals(codigo)) {
            return celdas.get(2);
        }
        if (celdas.size() > 3 && celdas.get(3).getCodigo().equals(codigo)) {
            return celdas.get(3);
        }
        return null;
    }

    public void cargarProducto(Producto producto,String codigo, int cantidad){
        Celda celdaRecuperada = buscarCelda(codigo);
        if(celdaRecuperada == null){
            return;
        }
        celdaRecuperada.ingresarProducto(producto, cantidad);
    }

    public void mostrarProductos(){
        String producto = "Sin producto asignado";
        String asignacion1= "";
        String asignacion2= "";
        String asignacion3 = "";
        String asignacion4 = "";

        if(celdas.get(0).getProducto() == null){
            asignacion1 = producto;
        }else {
            asignacion1 = "Producto:"+celdas.get(0).getCodigo()+" Precio:"+celdas.get(0).getProducto().getPrecio();
        }
        if(celdas.get(1).getProducto() == null){
            asignacion2 = producto;
        }else {
            asignacion2 = "Producto:"+celdas.get(1).getCodigo()+" Precio:"+celdas.get(1).getProducto().getPrecio();
        }
        if(celdas.get(2).getProducto() == null){
            asignacion3 = producto;
        }else {
            asignacion3 = "Producto:"+celdas.get(2).getCodigo()+" Precio:"+celdas.get(2).getProducto().getPrecio();
        }
        if(celdas.get(3).getProducto() == null){
            asignacion4 = producto;
        }else {
            asignacion4 = "Producto:"+celdas.get(3).getCodigo()+" Precio:"+celdas.get(3).getProducto().getPrecio();
        }

        System.out.println("Celda: "+celdas.get(0).getCodigo()+" Stock:"+celdas.get(0).getStock()+" "+ asignacion1);
        System.out.println("Celda: "+celdas.get(1).getCodigo()+" Stock:"+celdas.get(1).getStock()+" "+ asignacion2);
        System.out.println("Celda: "+celdas.get(2).getCodigo()+" Stock:"+celdas.get(2).getStock()+" "+ asignacion3);
        System.out.println("Celda: "+celdas.get(3).getCodigo()+" Stock:"+celdas.get(3).getStock()+" "+ asignacion4);
    }

    public Producto buscarProductoEnCelda(String codigo) {

        if (celdas.size() > 0 && celdas.get(0).getCodigo().equals(codigo)) {
            return celdas.get(0).getProducto();
        }

        if (celdas.size() > 1 && celdas.get(1).getCodigo().equals(codigo)) {
            return celdas.get(1).getProducto();
        }

        if (celdas.size() > 2 && celdas.get(2).getCodigo().equals(codigo)) {
            return celdas.get(2).getProducto();
        }

        if (celdas.size() > 3 && celdas.get(3).getCodigo().equals(codigo)) {
            return celdas.get(3).getProducto();
        }

        return null;
    }

}
