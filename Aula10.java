package com.cursoemvideo.cursopoocursoemvideo;

import com.cursoemvideo.cursopoocursoemvideo.entities.Aluno;
import com.cursoemvideo.cursopoocursoemvideo.entities.Funcionario;
import com.cursoemvideo.cursopoocursoemvideo.entities.Pessoa;
import com.cursoemvideo.cursopoocursoemvideo.entities.Professor;

public class Aula10 {
    public static void main(String[] args) {


        Aluno al1 = new Aluno();
        al1.setNome("Marcela");
        al1.setIdade(28);
        al1.setSexo("Feminino");
        al1.setCurso("Arquitetura");
        al1.setMatricula(56709);
        al1.cancelarMatricula();

        Professor pf1 = new Professor();
        pf1.setNome("Adamastor");
        pf1.setIdade(46);
        pf1.setSexo("Masculino");
        pf1.setEspecialidade("Engenharia de software");
        pf1.setSalario(7000);
        pf1.receberAum(500);
        System.out.println("Salariio profesor atualizado: " + pf1.getSalario());

        Funcionario f1 = new Funcionario();
        f1.setNome("Andreia");
        f1.setIdade(33);
        f1.setSexo("Feminino");
        f1.setSetor("Gerente");
        f1.setTrabalhando(true);
        f1.fazerAniversario();
        System.out.println(f1.getIdade());
        f1.mudarTrabalho("Supervisora");
        System.out.println(f1.getSetor());


        System.out.println(pf1.toString());
        System.out.println(f1.toString());
        System.out.println(al1.toString());


    }
}
