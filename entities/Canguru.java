package com.cursoemvideo.cursopoocursoemvideo.entities;

public class Canguru extends Mamifero{

    public void usarBolsa(){
        System.out.println("U S A N D O  B O L S A");
    }

    @Override
    public void locomover(){
        System.out.println("P U L A N D O");
    }
}
