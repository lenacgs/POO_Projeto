package com.company;
import java.util.*;
public class Exposicao extends Local {
    String tipo;
    int custo;

    public Exposicao(double coordenadas, ArrayList<Pessoa> inscritos, String tipo, int custo) {
        super(coordenadas, inscritos);
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
}
