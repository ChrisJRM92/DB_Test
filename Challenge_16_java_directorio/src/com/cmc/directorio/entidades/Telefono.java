package com.cmc.directorio.entidades;

public class Telefono {
    private String operadora;
    private String numero;
    private int codigo;
    private boolean tieneWp;

    public Telefono(String operadora, String numero, int codigo) {
        this.operadora = operadora;
        this.numero = numero;
        this.codigo = codigo;
        this.tieneWp = false;
    }

    public String getOperadora() {
        return operadora;
    }

    public String getNumero() {
        return numero;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isTieneWp() {
        return tieneWp;
    }

    public void setTieneWp(boolean tieneWp) {
        this.tieneWp = tieneWp;
    }
}
