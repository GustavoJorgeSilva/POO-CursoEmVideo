package com.cursoemvideo.cursopoocursoemvideo;

import com.cursoemvideo.cursopoocursoemvideo.entities.Aluno;
import com.cursoemvideo.cursopoocursoemvideo.entities.Bolsista;
import com.cursoemvideo.cursopoocursoemvideo.entities.Visitante;

public class Aula11 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Visitante v1 = new Visitante();

        b1.setCurso("ADS");
        b1.renovarBolsa();

        v1.setNome("Juvenal");
        v1.setIdade(26);
        v1.setSexo("M");
        System.out.println(v1.toString());
        b1.setNome("Gustavo");
        a1.setNome("Sergio");

        a1.setMatricula(10001);
        a1.setCurso("ADS");
        a1.setIdade(28);
        b1.setBolsa(15);

        a1.pagarMensalidade();
        b1.pagarMensalidade();


    }
}
