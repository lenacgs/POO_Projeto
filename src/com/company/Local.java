package com.company;
import java.util.*;
public class Local {
    double coordenadas;
    ArrayList<Pessoa> inscritos = new ArrayList<Pessoa>();

    public Local(double coordenadas, ArrayList<Pessoa> inscritos) {
        this.coordenadas = coordenadas;
        this.inscritos = inscritos;
    }

    public double getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(double coordenadas) {
        this.coordenadas = coordenadas;
    }

    public ArrayList<Pessoa> getInscritos() {
        return inscritos;
    }

    public void setInscritos(ArrayList<Pessoa> inscritos) {
        this.inscritos = inscritos;
    }

    public int getNumInscritos(Local local) {
        return local.inscritos.size();
    }

}
