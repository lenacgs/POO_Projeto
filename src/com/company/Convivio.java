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

    /*private void sortLocaisInscricoes() {
        Local toMove;
        for (int i=0; i<locais.size(); i++) {
            for (int j=i; j<locais.size(); j++) { //mudança: o j tem que ser igual a i e não a 0
                if (locais.get(i).getNumInscritos() < locais.get(j).getNumInscritos()) {
                    toMove = locais.get(i);
                    locais.set(i, locais.get(j));
                    locais.set(j, toMove);
                }
            }
        }
    }

    private void printLocais() {
        sortLocaisInscricoes();

        System.out.println("Locais disponíveis para visitar: ");
        for (int i=0; i<locais.size(); i++) {
            System.out.print("\n" + i + ". " + locais.get(i).getNome() + " ------ " + locais.get(i).getNumInscritos() + " inscritos");
            if (locais.get(i) instanceof Bar)
                System.out.println(" ------ " + ((Bar) locais.get(i)).getLotacao());
        }
    }*/

    public double getReceita() {
        double total = 0;

        for (Local l:locais) { //percorre a lista dos locais do convivio
            if (l instanceof Bar)
                total += (inscricoes.getNumInscritos(l) * ((Bar) l).getConsumoMin());
            else if (l instanceof Exposicao) //numa exposicao, os alunos têm 10% de desconto
                //receita = numAlunos * 0.1 * custo + (numInscritos - numAlunos) * custo;
                total += inscricoes.getNumAlunosInscritos(l) * 0.1 * ((Exposicao) l).getCusto() + (inscricoes.getNumInscritos(l) - inscricoes.getNumAlunosInscritos(l)) * ((Exposicao) l).getCusto();
        }
        return total;
    }




}
