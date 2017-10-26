package com.company;

public class Professor extends Pessoa {
    String tipo;

    public Professor(String perfil, String password, String username, int id, String tipo) {
        super(perfil, password, username, id);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
