package com.company;
import java.util.*;
public class Main {

    private static boolean debug = true; //para testes

    public static void main(String[] args) {

        if (debug) {

            ComunidadeDEI comunity = new ComunidadeDEI();
            Convivio convivio = new Convivio();
            Local[] v = new Local[4];
            v[0] = new Jardim("1233:42:5", "Jardim da Sereia", 25);
            v[1] = new Bar("2136:17623:434", "Moelas", 100, 1, null, 40);
            v[2] = new Exposicao("312:234:2937468","Trabalhos de Design", "Pintura", 5);
            String[] desportos = {"Futebol", "Basquetebol", "Ballet"};
            v[3] = new AreaDesportiva("123:234:234", "Campo de futebol", desportos);

            for (int i = 0; i < v.length; i++)
                convivio.locais.add(v[i]);

            Pessoa [] p = new Pessoa[5];
            p[0] = new Aluno("Boémio", "josepaulo", "1234", 1, "medicina");
            p[1] = new Professor("Poupadinho", "mariajose", "1234", 2, "catedrático");
            p[2] = new Funcionario("boémio", "antoniocosta", "1234", 3, "tempo inteiro");
            p[3] = new Professor("boemio", "marilia", "1234", 4, "contratado");
            p[4] = new Aluno("poupadinho", "mafalda", "1234", 5, "design");

            for (int i=0; i<p.length; i++)
                comunity.pessoas.add(p[i]);


        }

    }
}
