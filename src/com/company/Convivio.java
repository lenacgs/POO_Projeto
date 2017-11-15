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

    //calcula a receita de todos os locais do convivio
    public int getReceita() {
        int receita = 0;

        for (Local i : locais) {
            receita += i.getReceita();
        }

        return receita;
    }

    private void sortLocaisInscricoes() {
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
    }





}
