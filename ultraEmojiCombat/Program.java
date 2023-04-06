package com.cursoemvideo.cursopoocursoemvideo.ultraEmojiCombat;

import com.cursoemvideo.cursopoocursoemvideo.ultraEmojiCombat.entities.Luta;
import com.cursoemvideo.cursopoocursoemvideo.ultraEmojiCombat.entities.Lutador;
import com.cursoemvideo.cursopoocursoemvideo.ultraEmojiCombat.exception.FightException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    // AULA 07
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos lutadores deseja cadastrar? ");
        int n = leitor.nextInt();
        leitor.nextLine();
        Lutador[] lutadores = new Lutador[n];
        int contador = 0;
        while (contador < lutadores.length) {
            try {
                // Teste
//            Lutador gustavo = new Lutador("Gustavo","Brasileiro",28,181,94.0,5,1,3);
//            gustavo.apresentar();
//            System.out.println();
//            gustavo.status();


                for (int i = 0; i < lutadores.length; i++) {

                    System.out.print("Nome: ");
                    String nome = leitor.nextLine();
                    System.out.print("Nacionalidade: ");
                    String nacionalidade = leitor.nextLine();
                    System.out.print("Idade: ");
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

                    lutadores[i] = new Lutador(nome, nacionalidade, idade, altura, peso, vitorias, derrotas, empates);
                    contador++;
                }


                Luta UEC01 = new Luta();
                UEC01.marcarLuta(lutadores[0], lutadores[1]);
                UEC01.lutar();

                lutadores[0].status();
                lutadores[1].status();


            } catch (FightException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Erro de input");
                leitor.nextLine();
            }

        }

    }
}
