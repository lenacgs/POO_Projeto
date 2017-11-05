package com.company;

import java.security.SecureRandom;
import java.util.*;
import java.math.*;
import java.io.*;
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

    public void readAlunos() { //a ultima linha imprime 'null' mas nao sei porque
        String [] alunos = new String [10];
        try {
            File f = new File("alunoscomunidade.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            try {
                String input = br.readLine();
                int i=0;
                while (input != null) {
                    alunos[i] = input;
                    input = br.readLine();
                    i++;
                }
            } catch (IOException e1) {
                System.out.println("Exception while reading line from file: " + e1);
            }
        } catch (FileNotFoundException e2) {
            System.out.println("File does not exist: " + e2);
        }

        for (int i=0; i<alunos.length; i++)
            System.out.println(alunos[i]);
    }

    private static boolean debug = true; //para testes
    public static void main(String[] args) {

        ComunidadeDEI comunity = new ComunidadeDEI();

        comunity.readAlunos();
    }
}
