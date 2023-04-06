package com.cursoemvideo.cursopoocursoemvideo.ultraEmojiCombat.entities;

import com.cursoemvideo.cursopoocursoemvideo.ultraEmojiCombat.exception.FightException;

import java.util.InputMismatchException;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private int altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador() {
    }

    public Lutador(String nome, String nacionalidade, Integer idade, Integer altura, Double peso, Integer vitorias, Integer derrotas, Integer empates) {


        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);
        setCategoria(defininirCategoria());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    // METODOS

    public void apresentar() {
        System.out.println("Lutador: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Idade: " + idade);
        System.out.println("Medindo: " + altura + "cm");
        System.out.println("Pesando: " + peso);
        System.out.println("Categoria: " + categoria);
        System.out.println("Ganhou: " + vitorias);
        System.out.println("Perdeu: " + derrotas);
        System.out.println("Empatou: " + empates);

    }

    public void status() {
        System.out.println(getNome() + "é um peso " + categoria);
        System.out.println(getVitorias() + " vitoria(s)");
        System.out.println(getDerrotas() + " derrota(s)");
        System.out.println(getEmpates() + " empate(s)");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    private String defininirCategoria() {

        if (this.peso < 52.2 || this.peso > 120.2) {
            throw new FightException("Peso inválido");
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        return categoria;
    }


}
