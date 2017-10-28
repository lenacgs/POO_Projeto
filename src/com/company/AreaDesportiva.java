package com.company;
import java.util.*;
public class AreaDesportiva extends Parque {
    String [] desportos = new String[10]; //nao podemos usar o 10, devemos ter que usar o equivalente a um #define

    public AreaDesportiva(double coordenadas, ArrayList<Pessoa> inscritos, String[] desportos) {
        super(coordenadas, inscritos);
        this.desportos = desportos;
    }

    public String[] getDesportos() {
        return desportos;
    }

    public void setDesportos(String[] desportos) {
        this.desportos = desportos;
    }
}
