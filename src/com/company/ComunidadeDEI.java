package com.company;
import java.security.SecureRandom;
import java.util.*;
import java.math.*;
public class ComunidadeDEI {

    public ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public ComunidadeDEI() {
    }

    public ArrayList<Pessoa> getComunidade() {
        return pessoas;
    }

    public void setComunidade(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Pessoa procuraPessoa(String username, String password) {
        for (Pessoa i : pessoas) {
            if (i.getUsername().equals(username)) {
                if (i.getPassword().equals(password)) {
                    return i;
                }
            } else {
                System.out.println("Este username e password não estão registados na Comunidade do DEI.");
                return null;
            }
        }
        return null;
    }

    public void newPessoa() {
        String username, password, perfil;
        int id = novoID(); /*novoID é uma função que retorna um random que ainda não exista como id na comunidade*/
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Insira username pretendido: ");
            username = sc.nextLine();
        } while (verificaNovoUsername(username)/*retorna 1 se houver um username igual na comunidade*/);

        System.out.println("Insira a password pretendida: ");
        password = sc.nextLine();

        System.out.println("ID atribuído: " + id);

        System.out.println("Insira perfil: desportivo, cultural, boémio, poupadinho: ");
        perfil = sc.nextLine();

        System.out.println("Registar: aluno, professor ou funcionário?");
        String ans = sc.nextLine();
        switch (ans) {
            case "aluno":
                newAluno(username, password, id, perfil);
                break;
            case "professor":
                newProfessor(username, password, id, perfil);
                break;
            case "funcionario":
                newFuncionario(username, password, id, perfil);
        }
    }

    public void newAluno(String username, String password, int id, String perfil) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o curso frequentado: ");
        String curso = sc.nextLine();

        Aluno novo = new Aluno(perfil, username, password, id, curso);
        pessoas.add(novo);
    }

    public void newProfessor(String username, String password, int id, String perfil) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tipo de professor: auxiliar, associado ou catedrático: ");
        String tipo = sc.nextLine();

        Professor novo = new Professor(perfil, username, password, id, tipo);
        pessoas.add(novo);
    }

    public void newFuncionario(String username, String password, int id, String perfil) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tipo de funcionário: a tempo: integral ou parcial: ");
        String tipo = sc.nextLine();

        Funcionario novo = new Funcionario(perfil, username, password, id, tipo);
        pessoas.add(novo);
    }

    public boolean verificaNovoUsername(String username) {
        for (Pessoa i : pessoas) {
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
            for (Pessoa i : pessoas) {
                if (i.getId() == id) {
                    aux = true;
                }
            }
        } while (aux);
        return id;
    }
}
