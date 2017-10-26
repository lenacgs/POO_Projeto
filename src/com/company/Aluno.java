package com.company;

public class Aluno extends Pessoa {
    String curso;

    public Aluno(String perfil, String password, String username, int id, String curso) {
        super(perfil, password, username, id);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
