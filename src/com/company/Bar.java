package com.company;
import java.util.*;
public class Bar extends Local {
    private int lotacao;
    private int consumoMin;
    private ArrayList<Pessoa> guestList = new ArrayList<Pessoa>();
    private int maxGuestList;


    public Bar(String coordenadas, String nome, int lotacao, int consumoMin, int maxGuestList) {
        super(coordenadas, nome);
        this.lotacao = lotacao;
        this.consumoMin = consumoMin;
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

    public void inscreveGuestList(Pessoa p) { //caso a pessoa tenha perfil boemio tem lugar prioritario
      if (guestList.size() <= maxGuestList)
        guestList.add(p);
      else
        if (p.getPerfil().equals("boemio")) {
          for (int i=maxGuestList; i>0; i--) {
            if (!guestList.get(i).getPerfil().equals("boemio"))
              guestList.add(i, p); //vai por a nova pessoa na posição da anterior.
          }
        }
    }

    private void printGuestList() {
        for (int i=0; i<guestList.size(); i++) {
            if (guestList.get(i) instanceof Aluno)
                System.out.println(i + ". " + guestList.get(i).getClass() + ": " + guestList.get(i).getUsername() + ", " + guestList.get(i).getPerfil() + ", " + ((Aluno) guestList.get(i)).getCurso());
            System.out.println(i + ". " + guestList.get(i).getClass() + ": " + guestList.get(i).getUsername() + ", " + guestList.get(i).getPerfil());

        }
    }


}
