package com.cursoemvideo.cursopoocursoemvideo.relacionamentoClasses.entities;

import com.cursoemvideo.cursopoocursoemvideo.relacionamentoClasses.exception.FightException;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private Integer idade;
    private Integer altura;
    private Double peso;
    private String categoria;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;

    public Lutador() {
    }

    public Lutador(String nome, String nacionalidade, Integer idade, Integer altura, Double peso, Integer vitorias, Integer derrotas, Integer empates) {


        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.categoria = defininircategoria(peso);
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

    public void setCategoria(String categoria) {
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
        setDerrotas(getVitorias() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    private String defininircategoria(double peso) {

        if (peso < 52.2 || peso > 120.2) {
            throw new FightException("Peso inválido");
        } else if (peso <= 70.3) {
            categoria = "Leve";
        } else if (peso <= 83.9) {
            categoria = "Médio";
        } else if (peso <= 120.2) {
            categoria = "Pesado";
        }
        return categoria;
    }


}
