package com.company;
import java.util.*;

public abstract class Local {
    private String coordenadas;
    private String nome;

    public Local(String coordenadas, String nome) {
        this.coordenadas = coordenadas;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    abstract double getReceita();
}
