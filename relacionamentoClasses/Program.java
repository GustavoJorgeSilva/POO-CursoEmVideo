package com.cursoemvideo.cursopoocursoemvideo.relacionamentoClasses;

import com.cursoemvideo.cursopoocursoemvideo.relacionamentoClasses.entities.Lutador;
import com.cursoemvideo.cursopoocursoemvideo.relacionamentoClasses.exception.FightException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        try {
            Scanner leitor = new Scanner(System.in);
            // Teste
//            Lutador gustavo = new Lutador("Gustavo","Brasileiro",28,181,94.0,5,1,3);
//            gustavo.apresentar();
//            System.out.println();
//            gustavo.status();

            Lutador[] lutadores = new Lutador[2];
            for (int i = 0; i < lutadores.length; i++) {

                System.out.print("Nome: ");
                String nome = leitor.nextLine();
                System.out.print("Nacionalidade: ");
                String nacionalidade = leitor.nextLine();
                System.out.print("Idade");
                int idade = leitor.nextInt();
                System.out.print("Altura(cm): ");
                int altura = leitor.nextInt();
                System.out.print("Peso: ");
                double peso = leitor.nextDouble();
                System.out.print("Vitorias: ");
                int vitorias = leitor.nextInt();
                System.out.print("Derrotas: ");
                int derrotas = leitor.nextInt();
                System.out.print("Empates: ");
                int empates = leitor.nextInt();
                leitor.nextLine();

                lutadores[i] = new Lutador(nome,nacionalidade,idade,altura,peso,vitorias,derrotas,empates);
            }

            for (Lutador lut : lutadores){
                lut.apresentar();
                System.out.println("-------------------");
            }


        } catch (FightException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }


    }
}
