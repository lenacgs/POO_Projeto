package com.company;

public abstract class Pessoa {
    private String perfil;
    private String password;
    private String username;
    private int id;
    private boolean isInGuestList;

    public Pessoa(String perfil, String username, int id) {
        this.perfil = perfil;
        this.username = username;
        this.password = null;
        this.id = id;
        this.isInGuestList = false;
    }

    public boolean isInGuestList() {
        return isInGuestList;
    }

    public void setInGuestList(boolean inGuestList) {
        isInGuestList = inGuestList;
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
