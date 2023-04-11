package com.cursoemvideo.cursopoocursoemvideo.entities;

import com.cursoemvideo.cursopoocursoemvideo.entities.interfaces.AcoesVideo;

public class Video implements AcoesVideo {

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    // CONSTRUTOR


    public Video() {
    }

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.reproduzindo = false;
        this.views = 0;
        this.curtidas = 0;
    }

    // METODOS ESPECIAIS


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao = avaliacao / this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    // METODOS
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("----- Informacoes do video -----\n");
        sb.append("Titulo: " + titulo + "\n");
        sb.append("Avaliacao: " + avaliacao + "\n");
        sb.append("Views: " + views + " visualizacoes\n");
        sb.append("Likes: " + curtidas + "\n");
        sb.append("Reproduzindo: " + reproduzindo);

        return sb.toString();
    }
}
