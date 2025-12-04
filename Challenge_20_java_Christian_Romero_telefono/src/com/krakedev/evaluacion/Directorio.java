package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
    private ArrayList<Contacto> contactos = new ArrayList<>();
    private Date fechaModificacion;
    private ArrayList<Contacto> correctos = new ArrayList<>();
    private ArrayList<Contacto> incorrectos = new ArrayList<>();

    public Directorio() {
        this.contactos = new ArrayList<>();
    }

    public ArrayList<Contacto> getCorrectos() {
        return correctos;
    }

    public void setCorrectos(ArrayList<Contacto> correctos) {
        this.correctos = correctos;
    }

    public ArrayList<Contacto> getIncorrectos() {
        return incorrectos;
    }

    public void setIncorrectos(ArrayList<Contacto> incorrectos) {
        this.incorrectos = incorrectos;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public boolean agregarContacto(Contacto contacto){
        if (buscarPorCedula(contacto.getCedula()) != null) {
            return false;
        }
        this.contactos.add(contacto);
        this.fechaModificacion = new Date();
        return true;
    }

    public Contacto buscarPorCedula(String cedula){
        if(this.contactos.size()>=0){
            for(Contacto c: contactos){
                if(c.getCedula().equals(cedula)){
                    return c;
                }
            }
        }
        return null;
    }

    public String consultarUltimaModificacion(){
        if (this.fechaModificacion == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return sdf.format(this.fechaModificacion);
    }

    public int contarPerdidos(){
        int perdidos = 0;
        for(Contacto c: contactos){
            if(c.getDireccion()==null){
                perdidos+=1;
            }
        }
        return perdidos;
    }

    public int contarFijos(){
        int numerosFijos = 0;
        for(Contacto f: contactos){
            for(Telefono t: f.getTelefonos()){
                if("C".equals(t.getEstado()) && "Convencional".equals(t.getTipo())){
                    numerosFijos++;

                }
            }
        }
        return numerosFijos;
    }

    public void depurar(){
        for(Contacto c: contactos){
            if(c.getDireccion() != null){
                this.correctos.add(c);
            }else{
                this.incorrectos.add(c);
            }
        }
        contactos.clear();
    }
}
