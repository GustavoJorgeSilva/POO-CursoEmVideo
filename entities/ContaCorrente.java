package com.cursoemvideo.cursopoocursoemvideo.entities;

import com.cursoemvideo.cursopoocursoemvideo.entities.exceptions.ContaException;

public class ContaCorrente extends Conta {

    private double mensalidade;

    public ContaCorrente(int numeroConta, String titular, String tipoConta, double mensalidade, Double saldo) {
        super(numeroConta, titular, tipoConta, saldo);
        this.mensalidade = mensalidade;
    }

    public ContaCorrente() {
        super();
    }


    @Override
    public void saque(double valor, int numeroConta) {
        if (numeroConta == this.numeroConta){

            validarSaque(valor);
            saldo -= valor + 5;
            System.out.println("Saque na conta de " + getTitular() + " no valor de " + valor);
        }
       else {
           throw new ContaException("Conta não encontrada.");
        }
    }

    public double getMensalidade() {
        return mensalidade;
    }


    public void pagarMensalidade(double mensalidade) {
        this.saldo -= mensalidade;
    }

}
