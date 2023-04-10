package com.cursoemvideo.cursopoocursoemvideo.entities;

public class Bolsista extends Aluno{

    private double bolsa;

    // METODOS ESPECIAIS


    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    // METODOS
     public void renovarBolsa(){
         System.out.println("Bolsa renovada!");
     }

     @Override
    public void pagarMensalidade(){
         System.out.println(this.nome + " é bolsista, pagamento facilitado.");
     }


}
