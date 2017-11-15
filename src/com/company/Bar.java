package com.company;
import java.util.*;
public class Bar extends Local {
    private int lotacao;
    private double consumoMin;

    public Bar(String coordenadas, String nome, int lotacao, double consumoMin) {
        super(coordenadas, nome);
        this.lotacao = lotacao;
        this.consumoMin = consumoMin;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public double getConsumoMin() {
        return consumoMin;
    }

    public void setConsumoMin(int consumoMin) {
        this.consumoMin = consumoMin;
    }

    public double getReceita() {

    }

}
