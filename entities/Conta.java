package com.cursoemvideo.cursopoocursoemvideo.entities;

public class Conta {

    private int numeroConta;
    private String titular;
    private double saldo;
    private double limiteDeCredito;


    public Conta(int numeroConta, String titular, double limiteDeCredito) {
        if (saldo < 0){
            throw new ContaException("Erro: saldo menor que 0");
        }
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.limiteDeCredito = limiteDeCredito;
    }



    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }


    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }


    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        validarSaque(valor);
        this.saldo -= valor;

    }

    public void validarSaque(double valor) {
        if (valor > limiteDeCredito) {
            throw new ContaException("Valor solicitado maior do que o disponivel para saque");
        }

        if (valor > saldo) {
            throw new ContaException("Saldo menor do que o valor solicitado");
        }
    }
}
