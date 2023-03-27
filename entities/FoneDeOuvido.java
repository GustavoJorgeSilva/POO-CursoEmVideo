package com.cursoemvideo.cursopoocursoemvideo.entities;

public class FoneDeOuvido {

    private String modelo;
    private int volume;
    private String cor;
    private boolean ligado;

    public FoneDeOuvido() {
    }

    public FoneDeOuvido(String modelo, int volume, String cor, boolean ligado) {

        this.volume = volume;
        this.modelo = modelo;
        this.cor = cor;
        this.ligado = ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void mudarVolume(int volume) {
        if (volume > 100 || volume < 0) {
            System.out.println("ERRO:  volume tem que ser entre 0 e 100");
        } else {
            this.volume = volume;
        }

    }


}
