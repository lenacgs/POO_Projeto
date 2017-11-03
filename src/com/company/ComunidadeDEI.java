package com.company;
import java.security.SecureRandom;
import java.util.*;
import java.math.*;
public class ComunidadeDEI {

    private ArrayList<Pessoa> membros = new ArrayList<Pessoa>();
    private Convivio convivio = new Convivio();

    public ComunidadeDEI() {
    }

    public ArrayList<Pessoa> getComunidade() {
        return membros;
    }

    public void setComunidade(ArrayList<Pessoa> pessoas) {
        this.membros = pessoas;
    }

    public Pessoa procuraPessoa(String username) {
        for (Pessoa i : membros) {
            if (i.getUsername().equals(username)) {
                Scanner sc = new Scanner(System.in);
                String password = sc.nextLine();
                while(!i.getPassword().equals(password)) {
                    System.out.println("Password incorreta, tente outra vez: ");
                    password = sc.nextLine();
                }
                return i;
            }
            else {
                System.out.println("Este username e password não estão registados na Comunidade do DEI.");
                return null;
            }
        }
        return null;
    }

   /* public Pessoa newPessoa() {
        Pessoa p = null;
        String username, password, perfil;
        int id = novoID(); /*novoID é uma função que retorna um random que ainda não exista como id na comunidade
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Insira username pretendido: ");
            username = sc.nextLine();
        } while (verificaNovoUsername(username)/*retorna 1 se houver um username igual na comunidade);

        System.out.println("Insira a password pretendida: ");
        password = sc.nextLine();

        System.out.println("ID atribuído: " + id);

        System.out.println("Insira perfil: desportivo, cultural, boémio, poupadinho: ");
        perfil = sc.nextLine();

        System.out.println("Registar: aluno, professor ou funcionário?");
        String ans = sc.nextLine();
        switch (ans) {
            case "aluno":
                p = newAluno(username, password, id, perfil);
                break;
            case "professor":
                p = newProfessor(username, password, id, perfil);
                break;
            case "funcionario":
                p = newFuncionario(username, password, id, perfil);
        }
        return p;
    }

    public Pessoa newAluno(String username, String password, int id, String perfil) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o curso frequentado: ");
        String curso = sc.nextLine();

        Aluno novo = new Aluno(perfil, username, password, id, curso);
        membros.add(novo);
        return novo;
    }

    public Pessoa newProfessor(String username, String password, int id, String perfil) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tipo de professor: auxiliar, associado ou catedrático: ");
        String tipo = sc.nextLine();

        Professor novo = new Professor(perfil, username, password, id, tipo);
        membros.add(novo);
        return novo;
    }

    public Pessoa newFuncionario(String username, String password, int id, String perfil) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tipo de funcionário: a tempo: integral ou parcial: ");
        String tipo = sc.nextLine();

        Funcionario novo = new Funcionario(perfil, username, password, id, tipo);
        membros.add(novo);
        return novo;
    }

    public boolean verificaNovoUsername(String username) {
        for (Pessoa i : membros) {
            if (i.getUsername().equals(username)) {
                return true;
            }
            else return false;
        }
        return false;
    }

    public int novoID() {
        boolean aux = false;
        int id;
        do {
            Random rand = new Random();
            id = rand.nextInt(1000) + 1;
            for (Pessoa i : membros) {
                if (i.getId() == id) {
                    aux = true;
                }
            }
        } while (aux);
        return id;
    }*/


    public Pessoa login() {
        Pessoa p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira username: ");
        String username = sc.nextLine();
        for (Pessoa i : convivio.getInscritos()){
            if (i.getUsername().equals(username)) {
                System.out.println("Insira password: ");
                String password = sc.nextLine();
                while(!i.getPassword().equals(password)) {
                    System.out.println("Password incorreta. Insira de novo: ");
                    password = sc.nextLine();
                }
                System.out.println("Acesso concedido!");
                return i;
            }
            else System.out.println("Não existe nenhuma pessoa na comunidade com este username.");
        }
        return null;
    }


    private static boolean debug = true; //para testes
    public static void main(String[] args) {

        if (debug) {

            ComunidadeDEI comunity = new ComunidadeDEI();
            Local[] v = new Local[4];
            v[0] = new Jardim("1233:42:5", "Jardim da Sereia", 25);
            v[1] = new Bar("2136:17623:434", "Moelas", 100, 1, 40);
            v[2] = new Exposicao("312:234:2937468", "Trabalhos de Design", "Pintura", 5);
            String[] desportos = {"Futebol", "Basquetebol", "Ballet"};
            v[3] = new AreaDesportiva("123:234:234", "Campo de futebol", desportos);

            for (int i = 0; i < v.length; i++)
                comunity.convivio.locais.add(v[i]);

            Pessoa[] p = new Pessoa[5];
            p[0] = new Aluno("Boémio", "1234", "josepaulo", 1, "medicina");
            p[1] = new Professor("Poupadinho", "1234", "mariajose", 2, "catedrático");
            p[2] = new Funcionario("boémio", "1234", "antoniocosta", 3, "tempo inteiro");
            p[3] = new Professor("boemio", "1234", "marilia", 4, "contratado");
            p[4] = new Aluno("poupadinho", "1234", "inessantos", 5, "design");

            for (int i = 0; i < p.length; i++)
                comunity.membros.add(p[i]);

        }
    }
}
