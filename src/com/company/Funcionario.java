package com.company;

public class Funcionario extends Pessoa {
    String tipo;

    public Funcionario(String perfil, String username, int id, String tipo) {
        super(perfil, username, id);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
