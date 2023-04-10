package com.cursoemvideo.cursopoocursoemvideo;

import com.cursoemvideo.cursopoocursoemvideo.entities.Cachorro;
import com.cursoemvideo.cursopoocursoemvideo.entities.Lobo;

public class Aula13 {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro();
        Lobo l1 = new Lobo();

        c1.emitirSom();
        l1.emitirSom();
        c1.reagir(4,9.0);
        c1.reagir(17,4.5);

    }
}
