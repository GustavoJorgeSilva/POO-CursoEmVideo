package com.cursoemvideo.cursopoocursoemvideo.entities;

public class Ave extends Animal{

    private String corPena;

    // CONSTRUTOR


    public Ave() {
    }

    public Ave(double peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    // METODOS ESPECIAIS


    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    // METODOS

    public void fazerNinho(){
        System.out.println("------ F A Z E N D O    N I N H O ------");
    }
    @Override
    public void locomover() {
        System.out.println("V O A N D O");
    }

    @Override
    public void alimentar() {
        System.out.println(" C O M E N D O  F R U T A S");
    }

    @Override
    public void emitirSom() {
        System.out.println("S O M  D E  A V E");
    }
}
