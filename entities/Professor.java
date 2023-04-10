package com.cursoemvideo.cursopoocursoemvideo.entities;

public class Professor extends Pessoa{

    private String especialidade;
    private double salario;

    // CONSTRUTOR


    public Professor() {
    }

    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    // METODOS ESPECIAIS


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // METODOS

    public void receberAum(double valor){
        this.salario += valor;
    }
}
