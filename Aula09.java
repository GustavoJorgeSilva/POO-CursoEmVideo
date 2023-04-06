package com.cursoemvideo.cursopoocursoemvideo;

import com.cursoemvideo.cursopoocursoemvideo.entities.Livro;
import com.cursoemvideo.cursopoocursoemvideo.entities.Pessoa;

public class Aula09 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Gustavo",28,"Masculino");
        Livro l1 = new Livro("A menina que odiava livros","Paulo Coelho",68,p1);

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

        System.out.println(p1.getIdade());
        p1.fazerAniversario(28);
        System.out.println(p1.getIdade());



    }
}
