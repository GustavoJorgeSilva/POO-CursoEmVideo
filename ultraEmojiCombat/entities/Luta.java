package com.cursoemvideo.cursopoocursoemvideo.ultraEmojiCombat.entities;

import com.cursoemvideo.cursopoocursoemvideo.ultraEmojiCombat.exception.FightException;

import java.util.Random;

public class Luta {

    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;


    // Métodos Especiais


    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    // Metodos
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante) {
            System.out.println("Luta marcada");
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:  // EMPATE
                    System.out.println("EMPATOU");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    System.out.println("O lutador " + desafiante.getNome() + " tem agora " + desafiante.getEmpates());
                    System.out.println("O lutador " + desafiado.getNome() + " tem agora " + desafiado.getEmpates());
                    break;

                case 1:  // DESAFIADO VENCE
                    System.out.println("Vitória do lutador desafiado " + desafiado.getNome());
                    this.desafiado.ganharLuta();
                    System.out.println("Agora com " + desafiado.getVitorias() + " vitorias");
                    this.desafiante.perderLuta();
                    System.out.println("E o lutador desafiante " + desafiante.getNome() + " esta com " + desafiante.getDerrotas() + " derrotas");
                    break;

                case 2: // DESAFIANTE VENCE
                    System.out.println("Vitória do lutador desafiante " + desafiante.getNome());
                    this.desafiante.ganharLuta();
                    System.out.println("Agora com " + desafiante.getVitorias() + " vitoria(s)");
                    this.desafiado.perderLuta();
                    System.out.println("E o lutador desafiado " + desafiado.getNome() + " esta com " + desafiado.getDerrotas() + " derrota(s)");
                    break;
            }

        } else {
            if (desafiante == null || desafiado == null){
                throw new FightException("A luta não pode acontecer! Os lutadores sao de categorias diferentes.");
            }
        }
    }

}
