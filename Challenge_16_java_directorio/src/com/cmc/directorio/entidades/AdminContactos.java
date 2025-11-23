package com.cmc.directorio.entidades;

public class AdminContactos {

    public String buscarMasPesado(Contacto contacto, Contacto contacto1){
        if(contacto.getPeso()>contacto1.getPeso()){
            return contacto.getNombre();
        }else {
            return contacto1.getNombre();
        }
    }

    public boolean compararOperadoras(Telefono telefono, Telefono telefono1){
        if(telefono.getOperadora() == telefono1.getOperadora()){
            return true;
        }else {
            return false;
        }
    }


}
