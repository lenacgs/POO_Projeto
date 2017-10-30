package com.company;

import java.util.Collections.*;
import java.util.Comparator;
import java.util.*;

public class Convivio {
    ArrayList<Pessoa> inscritos = new ArrayList<Pessoa>();
    ArrayList<Local> locais = new ArrayList<Local>();

    public Convivio(ArrayList<Pessoa> inscritos, ArrayList<Local> locais) {
        this.inscritos = inscritos;
        this.locais = locais;
    }

    public ArrayList<Pessoa> getInscritos() {
        return inscritos;
    }

    public void setInscritos(ArrayList<Pessoa> inscritos) {
        this.inscritos = inscritos;
    }

    public ArrayList<Local> getLocais() {
        return locais;
    }

    public void setLocais(ArrayList<Local> locais) {
        this.locais = locais;
    }

    //calcula a receita de todos os locais do convivio
    private int getReceita() {
        int receita = 0;

        for (int i=0; i<locais.size(); i++) {

            if (locais.get(i) instanceof Exposicao) {
                Exposicao aux = (Exposicao)locais.get(i);

                for (int j=0; j<locais.get(i).inscritos.size(); j++) {
                    //caso seja Aluno tem desconto de 10%
                    if (locais.get(i).inscritos.get(j).getClass() == Aluno.class) {
                        receita += aux.getCusto() * 0.1;
                    }

                    else {
                        receita += aux.getCusto();
                    }
                }
            }

            else if (locais.get(i) instanceof Bar) {
                Bar aux = (Bar)locais.get(i);

                for (int j=0; j<locais.get(i).inscritos.size(); j++) {
                    receita += aux.getConsumoMin();
                }
            }
        }
        
        return receita;
    }


    private void sortLocaisInscricoes() {
        Local toMove;
        for (int i=0; i<locais.size(); i++) {
            if (locais.get(i).getNumInscritos() < locais.get(i+1).getNumInscritos()) {
                toMove = locais.get(i);
                locais.set(i, locais.get(i+1));
                locais.set(i+1, toMove);
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
















