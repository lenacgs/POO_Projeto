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

    private int getReceita() {
        int receita = 0;

        for (int i=0; i<locais.size(); i++) {

            if (locais.get(i) instanceof Exposicao) {
                Exposicao aux = (Exposicao)locais.get(i);

                for (int j=0; j<locais.get(i).inscritos.size(); j++) {

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

}
