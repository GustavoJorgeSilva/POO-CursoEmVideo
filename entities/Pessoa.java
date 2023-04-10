package com.cursoemvideo.cursopoocursoemvideo.entities;

public abstract class Pessoa {

    // AULA 09

    protected String nome;
    protected int idade;
    protected String sexo;

    // CONSTRUTOR


    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // METODOS ESPECIAIS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    // METODOS

    public final void fazerAniversario(){
            setIdade(getIdade() + 1);
    }
}
