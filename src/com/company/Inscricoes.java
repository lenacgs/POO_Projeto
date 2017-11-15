package com.company;
import java.util.*;

public class Inscricoes {
    private ArrayList<Inscricao> inscricoes = new ArrayList<>();


    public int getNumInscritos(Local local) { //retorna o numero de inscritos de um certo local
        int res = 0;
        for (Inscricao i:inscricoes) { //percorre a lista de inscricoes
            for (Local l:i.getLocais()) { //percorre a lista de locais seleccionados por cada pessoa
                if (l.getNome().equals(local.getNome())) //se o nome do local coincidir com o do local de entrada, incrementa o resultado
                    res++;
            }
        }
        return res;
    }

    public int getNumAlunosInscritos(Local local) {
        int res = 0;
        for (Inscricao i:inscricoes) {
            for (Local l:i.getLocais()) {
                if (l.getNome().equals(local.getNome()) && i.getUser() instanceof Aluno) {
                    res++;
                }
            }
        }
        return res;
    }
}
