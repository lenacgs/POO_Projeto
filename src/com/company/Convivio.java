package com.company;

import java.util.Collections.*;
import java.util.Comparator;
import java.util.*;
import java.lang.*;

public class Convivio {
    private Inscricoes inscricoes = new Inscricoes();
    private ArrayList<Local> locais = new ArrayList<>();
    private int percGuestList;

    public Convivio() {
    }

    public void setInscricoes(Inscricoes inscricoes) {
        this.inscricoes = inscricoes;
    }

    public void setLocais(ArrayList<Local> locais) {
        this.locais = locais;
    }

    public void setPercGuestList(int percGuestList) {
        this.percGuestList = percGuestList;
    }

    public Inscricoes getInscricoes() {

        return inscricoes;
    }

    public ArrayList<Local> getLocais() {
        return locais;
    }

    public int getPercGuestList() {
        return percGuestList;
    }


    public void printLocais() {
        System.out.println("Locais disponíveis para visita:\n");
        int i = 0;
        for (Local l : locais) {
            System.out.println(i + ". " + l.getNome());
            i++;
        }
    }


    public double getReceita() {
        double total = 0;

        for (Local l : locais) { //percorre a lista dos locais do convivio
            if (l instanceof Bar)
                total += (inscricoes.getNumInscritos(l) * ((Bar) l).getConsumoMin());
            else if (l instanceof Exposicao) //numa exposicao, os alunos têm 10% de desconto
                //receita = numAlunos * 0.1 * custo + (numInscritos - numAlunos) * custo;
                total += inscricoes.getNumAlunosInscritos(l) * 0.1 * ((Exposicao) l).getCusto() + (inscricoes.getNumInscritos(l) - inscricoes.getNumAlunosInscritos(l)) * ((Exposicao) l).getCusto();
        }
        return total;
    }


    public void main() {
        System.out.println("Bem vindo! Pretende inscrever-se no Convivio do DEI?");
    }
}