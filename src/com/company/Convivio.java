package com.company;

import java.util.Collections.*;
import java.util.Comparator;
import java.util.*;
import java.lang.*;

public class Convivio {
    public ArrayList<Pessoa> inscritos = new ArrayList<Pessoa>();
    public ArrayList<Local> locais = new ArrayList<Local>();
    private ComunidadeDEI comunity = new ComunidadeDEI();

    public Convivio() {
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


    private void inscrevePessoa(Pessoa p) {
        inscritos.add(p);
    }

    private void seleccaoLocais(Pessoa p) {
        printLocais();
        System.out.println("Qual o número de locais que pretende visitar?: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 5) {
          System.ou.println("Só pode visitar até cinco locais!");
          System.out.println("Qual o número de locais que pretende visitar?: ");
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
        }
        int local;
        for (int i=0; i<n; i++) {
            System.out.println("Indique o identificador do local que pretende visitar: ");
            local = sc.nextInt();
            locais.get(local-1).inscritos.add(p);
        }
    }
}
