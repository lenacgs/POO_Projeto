package com.company;
import java.util.*;

public class Inscricao {
    private Pessoa user;
    private ArrayList<Local> locais = new ArrayList<>();

    public Pessoa getUser() {
        return user;
    }

    public void setUser(Pessoa user) {
        this.user = user;
    }

    public ArrayList<Local> getLocais() {
        return locais;
    }

    public void setLocais(ArrayList<Local> locais) {
        this.locais = locais;
    }

    public Inscricao(Pessoa user) {
        this.user = user;

    }

    public void selectLocais(Pessoa pessoa) {

    }
}


/*private void selectLocais(Pessoa p) {
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
    }*/
