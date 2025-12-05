package com.cmc.servicios;

import com.cmc.entidades.Cliente;
import com.cmc.evaluacion.Prestamo;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Prestamo> prestamos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente buscarCliente(String cedula){
        for(Cliente c: clientes){
            if(cedula.equals(c.getCedula())){
                return c;
            }
        }
        return null;
    }

    public void registrarClientes(Cliente cliente){
        boolean encontrado = false;
        for(Cliente c: clientes){
            if(buscarCliente(cliente.getCedula()) != null){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("Cliente ya existe: "+ cliente.getCedula());
        }else {
            this.clientes.add(cliente);
        }
    }
}
