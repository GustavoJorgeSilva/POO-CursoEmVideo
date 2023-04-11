package com.cursoemvideo.cursopoocursoemvideo.entities;

public abstract class Pessoa2 {

    protected String nome;
    protected int idade;
    protected String sexo;
    protected double experiencia;

    // CONSTRUTOR

    public Pessoa2(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
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

    public double getExperiencia() {
        return experiencia;
    }


    // METODOS

    protected abstract void ganharExp();

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + nome + "\n");
        sb.append("Idade: " + idade + "\n");
        sb.append("Sexo: " + sexo + "\n");
        sb.append("Experiencia: " + experiencia + "\n");


        return sb.toString();
    }
}
