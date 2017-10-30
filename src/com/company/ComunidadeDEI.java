package com.company;
import java.util.*;
public class ComunidadeDEI {
    ArrayList<Pessoa> comunidade = new ArrayList<Pessoa>();

    public ComunidadeDEI(ArrayList<Pessoa> comunidade) {
        this.comunidade = comunidade;
    }

    public ArrayList<Pessoa> getComunidade() {
        return comunidade;
    }

    public void setComunidade(ArrayList<Pessoa> comunidade) {
        this.comunidade = comunidade;
    }
}
