package com.cursoemvideo.cursopoocursoemvideo.entities;

public class Aluno extends Pessoa {


    private int matricula;
    private String curso;

    //CONSTRUTOR


    public Aluno() {
    }

    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    // METODOS ESPECIAIS

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    // METODOS

    public void cancelarMatricula() {
        System.out.println("A matricula sera cancelada!");
    }

    public void pagarMensalidade(){
        System.out.println("Pagango mensalidade do aluno " + this.nome);
    }
}
