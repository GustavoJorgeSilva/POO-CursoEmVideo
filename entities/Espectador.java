package com.cursoemvideo.cursopoocursoemvideo.entities;

public class Espectador extends Pessoa2{

    private String login;
    private int totalAssistido;

    public Espectador(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    // METODOS ESPECIAIS


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    // METODOS
    public void viuMaisUm(){

    }

    @Override
    protected void ganharExp() {

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("----- Informacoes do espectador -----\n");
        sb.append(super.toString());
        sb.append("login: " + login + "\n");
        sb.append("Total assistido: " + totalAssistido + "\n");


        return sb.toString();
    }
}
