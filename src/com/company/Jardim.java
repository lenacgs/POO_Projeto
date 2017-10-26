package com.company;

public class Jardim extends Parque {
    int area;

    public Jardim(double coordenadas, ArrayList<Pessoa> inscritos, int area) {
        super(coordenadas, inscritos);
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
