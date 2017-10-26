package com.company;

public class Pessoa {
    String perfil;
    String password;
    String username;
    int id;

    public Pessoa(String perfil, String password, String username, int id) {
        this.perfil = perfil;
        this.password = password;
        this.username = username;
        this.id = id;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
