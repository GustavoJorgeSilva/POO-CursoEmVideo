package com.cursoemvideo.cursopoocursoemvideo.entities;

public class Peixe extends Animal{

    private String corEscama;

    public Peixe() {
    }

    public Peixe(double peso, int idade, int membros, String corEscama) {
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

    public void fazerBolha(){
        System.out.println("BLUBLUBLUBLU -- SOLTANDO BOLHAS");
    }
    @Override
    public void locomover() {
        System.out.println("N A D A N D O");
    }

    @Override
    public void alimentar() {
        System.out.println("C O M E N D O  S U B S T A N C I A S");
    }

    @Override
    public void emitirSom() {
        System.out.println("P E I X E  N A O  F A Z  S O M");
    }
}
