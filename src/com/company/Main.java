package com.company;
import java.util.*;
public class Main {

    private static boolean debug = true; //para testes

    public static void main(String[] args) {

        if (debug) {

            ArrayList<Pessoa> inscritos = new ArrayList<>();
            ArrayList<Local> locais = new ArrayList<>();

            Convivio convivio = new Convivio(inscritos, locais);
            Local[] v = new Local[4];
            v[0] = new Jardim("1233:42:5", inscritos, "Jardim da Sereia", 25);
            v[1] = new Bar("2136:17623:434", inscritos, "Moelas", 100, 1, null, 40);
            v[2] = new Exposicao("312:234:2937468", inscritos, "Trabalhos de Design", "Pintura", 5);
            String[] desportos = {"Futebol", "Basquetebol", "Ballet"};
            v[3] = new AreaDesportiva("123:234:234", inscritos, "Campo de futebol", desportos);

            for (int i = 0; i < v.length; i++) {
                convivio.locais.add(v[i]);
            }

            for (int i = 0; i < locais.size(); i++)
                System.out.println(locais.get(i).getNome());

        }

    }
}
