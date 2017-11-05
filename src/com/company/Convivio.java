package com.company;

import java.util.Collections.*;
import java.util.Comparator;
import java.util.*;
import java.lang.*;

public class Convivio {
    private ArrayList<Pessoa> inscritos = new ArrayList<Pessoa>();
    private ArrayList<Local> locais = new ArrayList<Local>();

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

    private void inscrevePessoa(Pessoa p) {
        inscritos.add(p);
    }

    private void selectLocais(Pessoa p) {
        printLocais();
        System.out.println("Qual o número de locais que pretende visitar?: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //isto devia ser um metodo de protecao
        while (n > 5) {
          System.out.println("Só pode visitar até cinco locais!");
          System.out.println("Qual o número de locais que pretende visitar?: ");
          n = sc.nextInt();
        }
        
        int local;
        for (int i=0; i<n; i++) {
            System.out.println("Indique o identificador do local que pretende visitar: ");
            local = sc.nextInt();
            locais.get(local-1).getInscritos().add(p);
        }
    }


}
