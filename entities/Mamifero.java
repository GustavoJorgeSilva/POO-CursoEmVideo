package com.cursoemvideo.cursopoocursoemvideo.entities;

public class Mamifero extends Animal{

    private String corPelo;

    public Mamifero() {
    }

    public Mamifero(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    // METODOS ESPECIAIS
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    // METODOS
    @Override
    public void locomover() {
        System.out.println("C O R R E N D O");
    }

    @Override
    public void alimentar() {
        System.out.println("M A M A N D O");
    }

    @Override
    public void emitirSom() {
        System.out.println("S O M  D E  M A M I F E R O ");
    }
}
