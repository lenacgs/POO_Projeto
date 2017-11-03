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
    public double getReceita() {
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

    public Pessoa login() {
        System.out.println("username ('r' para registar novo user): ");
        Pessoa p;
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        if (username.equals("r")) p = comunity.newPessoa();

        else {
            p = comunity.procuraPessoa(username);
            if (p == null)
                p = comunity.newPessoa();
        }
        return p;

    }


    private static boolean debug = true; //para testes
    public static void main(String[] args) {

        if (debug) {

            ComunidadeDEI comunity = new ComunidadeDEI();
            Convivio convivio = new Convivio();
            Local[] v = new Local[4];
            v[0] = new Jardim("1233:42:5", "Jardim da Sereia", 25);
            v[1] = new Bar("2136:17623:434", "Moelas", 100, 1, 40);
            v[2] = new Exposicao("312:234:2937468", "Trabalhos de Design", "Pintura", 5);
            String[] desportos = {"Futebol", "Basquetebol", "Ballet"};
            v[3] = new AreaDesportiva("123:234:234", "Campo de futebol", desportos);

            for (int i = 0; i < v.length; i++)
                convivio.locais.add(v[i]);

            Pessoa[] p = new Pessoa[5];
            p[0] = new Aluno("Boémio", "1234", "josepaulo", 1, "medicina");
            p[1] = new Professor("Poupadinho", "1234", "mariajose", 2, "catedrático");
            p[2] = new Funcionario("boémio", "1234", "antoniocosta", 3, "tempo inteiro");
            p[3] = new Professor("boemio", "1234", "marilia", 4, "contratado");
            p[4] = new Aluno("poupadinho", "1234", "inessantos", 5, "design");

            for (int i = 0; i < p.length; i++)
                comunity.pessoas.add(p[i]);

        }
    }
}
