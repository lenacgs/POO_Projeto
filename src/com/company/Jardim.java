package com.company;
import java.util.*;
public class Jardim extends Parque {
    int area;

    public Jardim(String coordenadas, String nome, int area) {
        super(coordenadas, nome);
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
