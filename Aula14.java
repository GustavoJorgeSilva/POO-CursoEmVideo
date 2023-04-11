package com.cursoemvideo.cursopoocursoemvideo;

import com.cursoemvideo.cursopoocursoemvideo.entities.Espectador;
import com.cursoemvideo.cursopoocursoemvideo.entities.Video;
import com.cursoemvideo.cursopoocursoemvideo.entities.Visualizacao;
import com.cursoemvideo.cursopoocursoemvideo.entities.exceptions.MainException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

import java.util.InputMismatchException;

public class Aula14 {
    public static void main(String[] args) {

        try {
            Video v[] = new Video[3];
            v[0] = new Video("Aula 01 de POO");
            v[1] = new Video("Aula 02 de POO");
            v[2] = new Video("Aula 03 de POO");

            v[0].like();
//        System.out.println(v[0].toString());

            Espectador espec[] = new Espectador[2];

            espec[0] = new Espectador("Gustavo", 28, "M", "gustavo.jorge@hotmail.com.br");
            espec[1] = new Espectador("Marcela", 28, "M", "marcela19951@gmail.com");


//        System.out.println(espec[0].toString());

            Visualizacao vis[] = new Visualizacao[5];

            vis[0] = new Visualizacao(espec[1], v[0]); // aula 01
            vis[0].avaliar();
            System.out.println(vis[0].toString());
            vis[1] = new Visualizacao(espec[0], v[2]); // aula 02
            vis[1].avaliar(6);

            System.out.println(vis[1].toString());
        } catch (MainException e){
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
