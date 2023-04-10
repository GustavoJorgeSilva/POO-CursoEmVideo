package com.cursoemvideo.cursopoocursoemvideo.entities;

public class Funcionario extends Pessoa{

    private String setor;
    private boolean trabalhando;

    // CONSTRUTOR


    public Funcionario() {
    }

    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    // METODOS ESPECIAIS


    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    // METODOS

    public void mudarTrabalho(String setor){
        this.setor = setor;
    }
}
