package com.company;
import java.util.*;
public class Bar extends Local {
    int lotacao;
    int consumoMin;
    ArrayList<Pessoa> guestList = new ArrayList<Pessoa>();
    int maxGuestList;

    public Bar(String coordenadas, ArrayList<Pessoa> inscritos, String nome, int lotacao, int consumoMin, ArrayList<Pessoa> guestList, int maxGuestList) {
        super(coordenadas, inscritos, nome);
        this.lotacao = lotacao;
        this.consumoMin = consumoMin;
        this.guestList = guestList;
        this.maxGuestList = maxGuestList;

    }

    public int getMaxGuestList() {
        return maxGuestList;
    }

    public void setMaxGuestList(int maxGuestList) {
        this.maxGuestList = maxGuestList;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public int getConsumoMin() {
        return consumoMin;
    }

    public void setConsumoMin(int consumoMin) {
        this.consumoMin = consumoMin;
    }

    public ArrayList<Pessoa> getGuestList() {
        return guestList;
    }

    public void setGuestList(ArrayList<Pessoa> guestList) {
        this.guestList = guestList;
    }


    private void printGuestList() {
        for (int i=0; i<guestList.size(); i++) {
            if (guestList.get(i) instanceof Aluno)
                System.out.println(i + ". " + guestList.get(i).getClass() + ": " + guestList.get(i).getUsername() + ", " + guestList.get(i).getPerfil() + ", " + ((Aluno) guestList.get(i)).getCurso());
            System.out.println(i + ". " + guestList.get(i).getClass() + ": " + guestList.get(i).getUsername() + ", " + guestList.get(i).getPerfil());

        }
    }


}
