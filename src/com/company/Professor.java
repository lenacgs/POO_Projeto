package com.company;

public class Professor extends Pessoa {
    String tipo;

    public Professor(String perfil, String username, String password, int id, String tipo) {
        super(perfil, username, password, id);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
