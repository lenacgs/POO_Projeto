package com.company;
import java.util.*;
public class Exposicao extends Local {
    private String tipo;
    private int custo;

    public Exposicao(String coordenadas, String nome, String tipo, int custo) {
        super(coordenadas, nome);
        this.tipo = tipo;
        this.custo = custo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public double getReceita() {
        double receita = 0;
        for (Pessoa i : getInscritos()) {
            if (i instanceof Aluno)
                receita += 0.1 * custo;
            else
                receita += custo;
        }
        return receita;
    }
}
