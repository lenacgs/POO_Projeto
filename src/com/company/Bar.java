package com.company;

public class Bar extends Local {
    int lotacao;
    int consumoMin;
    ArrayList<Pessoa> guestList = new ArrayList<Pessoa>();

    public Bar(double coordenadas, ArrayList<Pessoa> inscritos, int lotacao, int consumoMin, ArrayList<Pessoa> guestList) {
        super(coordenadas, inscritos);
        this.lotacao = lotacao;
        this.consumoMin = consumoMin;
        this.guestList = guestList;
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
}
