package com.company;
import java.util.*;
public  class Local {
    String coordenadas;
    ArrayList<Pessoa> inscritos = new ArrayList<Pessoa>();
    String nome;

    public Local(String coordenadas, String nome) {
        this.coordenadas = coordenadas;
        this.nome = nome;
    }

    public Local() {

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

    public ArrayList<Pessoa> getInscritos() {
        return inscritos;
    }

    public void setInscritos(ArrayList<Pessoa> inscritos) {
        this.inscritos = inscritos;
    }

    public int getNumInscritos() {
        return inscritos.size();
    }

}
