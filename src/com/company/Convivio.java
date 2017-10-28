package com.company;
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

    public void sortLocaisInscricoes() {
        Local localAux;

        for (int i=0; i<locais.size(); i++) {
            for (int j=1; j< locais.size(); j++) {
                if (locais.get(i).getNumInscritos() < locais.get(j).getNumInscritos()) {
                    localAux = locais.get(i);
                    locais.get(i) = locais.get(j);
                    locais.get(j) = localAux;
                }
            }
        }

        return locais;
    }

    public void printLocais() {
        locaisOrdenados = sortLocaisInscricoes(); //para que possamos comecar a impressao dos locais com eles já ordenados.
        //falta nos acrescentar o atributo nome aos locais
        for(int i=0; i<locaisOrdenados.size(); i++) {
            System.out.println("Local: " + locaisOrdenados.get(i).getNome());
            System.out.println("Número de inscritos: " + getNumInscritos(locaisOrdenados.get(i)));

            if (locaisOrdenados.get(i).getClass() == Bar.class)
                System.out.println("Lotação: " + locaisOrdenados.getLotacao());
        }
    }



}
















