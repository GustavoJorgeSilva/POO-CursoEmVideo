package com.cursoemvideo.cursopoocursoemvideo.entities;

import com.cursoemvideo.cursopoocursoemvideo.entities.exceptions.ContaException;

public class ContaPoupanca extends Conta {

    private double rendimento;

    public ContaPoupanca(int numeroConta, String titular, String tipoConta, double rendimento, Double saldo) {
        super(numeroConta, titular, tipoConta, saldo);
        this.rendimento = rendimento;
    }

    public ContaPoupanca() {
        super();
    }

    @Override
    public void saque(double valor, int numeroConta) {
        if (numeroConta == this.numeroConta){
            validarSaque(valor);
            saldo -= valor;
            System.out.println("Saque na conta de " + getTitular() + " no valor de " + valor);
        }
        else {
            throw new ContaException("Conta não encontrada.");
        }
    }

    public double getRendimento() {
        return rendimento;
    }


    public void rendimentoConta(double rendimento) {
        saldo += this.saldo * (rendimento / 100);

    }
}
