package com.cursoemvideo.cursopoocursoemvideo.entities;

import com.cursoemvideo.cursopoocursoemvideo.entities.exceptions.MainException;

public class Visualizacao {

    private Espectador espectador;
    private Video filme;

    public Visualizacao(Espectador espectador, Video filme) {
        if (espectador == null || filme == null){
            throw new MainException("Erro: Espectador ou video nao existente.");
        } else {
            this.espectador = espectador;
            this.filme = filme;
            this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
            this.filme.setViews(filme.getViews() + 1);
        }
    }

    public Pessoa2 getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }


    // METODOS

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(double porcentagem) {
        int tot = 0;
        if (porcentagem <= 20){
            tot = 3;
        } else if (porcentagem <= 50 ) {
            tot = 5;
        } else if (porcentagem <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("----- Informacoes sobre a visualizacao (espectador e video) -----\n");
        sb.append(espectador + "\n");
        sb.append(filme + "\n");

        return sb.toString();
    }
}
