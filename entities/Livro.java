package com.cursoemvideo.cursopoocursoemvideo.entities;

import com.cursoemvideo.cursopoocursoemvideo.entities.interfaces.Publicacao;

import java.util.Objects;

public class Livro implements Publicacao {
    // AULA 09

    private String titulo;
    private String autor;
    private Integer totPaginas;
    private Integer pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // METODOS ESPECIAIS


    public Livro(String titulo, String autor, Integer totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(Integer totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Integer getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(Integer pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // METODOS

    public void detalhes() {
        System.out.println("Nome do livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de paginas: " + getTotPaginas());
        System.out.println("Pagina atual: " + getPagAtual());
        System.out.println("O livro esta aberto? " + isAberto());
        System.out.println("O livro está em posse de : " + leitor.getNome());
    }

    @Override
    public void abrir() {
        if (aberto) {
            System.out.println("O livro já está aberto.");
        }
        this.aberto = true;
    }

    @Override
    public void fechar() {
        if (!aberto) {
            System.out.println("o livro já está fechado.");
        }
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        if (!isAberto()) {
            System.out.println("Impossivel folhear .");
        }
        else if (getTotPaginas() >= pagina) {
            System.out.println("Folheando...");
            System.out.println("Pagina: " + pagina);
            setPagAtual(pagina);
        }
        else if (pagina > getTotPaginas()) {
            System.out.println("Impossivel folhear para a pagina " + pagina + " o livro possui " + getTotPaginas() + " paginas.");
            System.out.println("Pagina: " + getPagAtual());

        }
    }

    @Override
    public void avancarpag() {
        if (pagAtual >= totPaginas || !isAberto()) {
            System.out.println("Impossivel avancar a pagina.");
        } else {
            System.out.println("Avancando pagina...");
            setPagAtual(getPagAtual() + 1);
            System.out.println("Pagina: " + getPagAtual());
        }
    }

    @Override
    public void voltarPag() {
        if (pagAtual < 0 || !isAberto()) {
            System.out.println("Impossivel voltar a pagina.");
        }
         else {
            System.out.println("Voltando pagina...");
            setPagAtual(getPagAtual() - 1);
            System.out.println("Pagina: " + getPagAtual());
        }
    }
}
