package com.cursoemvideo.cursopoocursoemvideo.entities;

public class Reptil extends Animal {

    private String corEscama;


    // CONSTRUTOR


    public Reptil() {

    }

    public Reptil(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    // METODOS ESPECIAIS


    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    // METODOS
    @Override
    public void locomover() {
        System.out.println("R A S T E J A N D O");
    }

    @Override
    public void alimentar() {
        System.out.println("C O M E N D O  V E G E T A I S");
    }

    @Override
    public void emitirSom() {
        System.out.println(" S O M  D E  R E P T I L");
    }
}
