package com.company;

public class Aluno extends Pessoa {
    String curso;

    public Aluno(String perfil, String username, int id, String curso) {
        super(perfil, username, id);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
