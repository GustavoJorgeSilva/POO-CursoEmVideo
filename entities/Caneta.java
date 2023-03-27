package com.cursoemvideo.cursopoocursoemvideo.entities;

public class Caneta {

    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    public Caneta() {
        tampar();
    }

    public Caneta(String modelo, String cor, double ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }



    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Está com a carga em " + this.carga + "%");
    }

    public void destampar() {
        this.tampada = false;
    }

    public void tampar() {
        this.tampada = true;
    }


    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro: não posso rabiscar");
        } else {
            System.out.println("R A B I S C A N D O");
            ;
        }
    }

    public void escrever(String texto) {
        if (this.tampada){
            System.out.println("Erro: não posso escrever");
        } else {
            System.out.println(texto);
        }
    }

    public void pintar(){
        if(this.tampada){
            System.out.println("Erro: não posso pintar");
        }
        else {
            System.out.println("P I N T A N D O");
        }
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + " " +
                "Cor: " + cor + " " +
                "Ponta: " + ponta + " " +
                "Carga: " + carga + " " +
                "Tampada: " + tampada;
    }
}
