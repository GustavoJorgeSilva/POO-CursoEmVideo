package com.cursoemvideo.cursopoocursoemvideo;

import com.cursoemvideo.cursopoocursoemvideo.entities.Aluno;
import com.cursoemvideo.cursopoocursoemvideo.entities.Livro;
import com.cursoemvideo.cursopoocursoemvideo.entities.Pessoa;

public class Aula09 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("gustavo",28,"Masc",100,"ADS");
        Livro l1 = new Livro("A menina que odiava livros","Paulo Coelho",68,aluno);

        l1.abrir();
        l1.avancarpag();
        l1.avancarpag();
        l1.avancarpag();
        l1.avancarpag();
        l1.avancarpag();
        l1.folhear(68);

        l1.voltarPag();
        System.out.println(l1.getPagAtual());
        l1.detalhes();





    }
}
