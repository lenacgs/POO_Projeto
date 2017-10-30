package com.company;
import java.util.*;
public class Jardim extends Parque {
    int area;

    public Jardim(String coordenadas, ArrayList<Pessoa> inscritos, String nome, int area) {
        super(coordenadas, inscritos, nome);
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
