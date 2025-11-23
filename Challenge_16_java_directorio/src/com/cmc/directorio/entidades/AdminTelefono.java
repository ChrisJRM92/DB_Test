package com.cmc.directorio.entidades;

public class AdminTelefono {


    public void activarMensajeria(Telefono telefono){
        if(telefono.getOperadora() == "movi"){
            telefono.setTieneWp(true);
        }
    }

    public int contarMovi(Telefono telefono, Telefono telefono1, Telefono telefono2){
        int count = 0;

        if(telefono.getOperadora() == "movi"){
            count++;
        }
        if (telefono1.getOperadora() == "movi") {
            count++;
        }
        if (telefono2.getOperadora() == "movi") {
            count++;
        }
        return count;
    }

    public int contarClaro(Telefono telefono, Telefono telefono1, Telefono telefono2){
        int count = 0;
        if(telefono.getOperadora() == "claro"){
            count++;
        }
        if (telefono1.getOperadora() == "claro") {
            count++;
        }
        if (telefono2.getOperadora() == "claro") {
            count++;
        }
        return count;
    }
}
