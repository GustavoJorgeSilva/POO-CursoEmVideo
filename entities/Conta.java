package com.cursoemvideo.cursopoocursoemvideo.entities;

import com.cursoemvideo.cursopoocursoemvideo.entities.exceptions.ContaException;

public abstract class Conta {

    public Integer numeroConta;
    private String titular;
    protected double saldo;

    private boolean status;

    protected String tipoConta;

    public Conta() {
    }

    public Conta(int numeroConta, String titular, String tipoConta, Double saldo) {
        if (saldo < 0) {
            throw new ContaException("Erro: saldo menor que 0");
        }
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.titular = titular;
        this.status = false;
        this.tipoConta = tipoConta;
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

    public String getTipoConta() {
        return tipoConta;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    public boolean isStatus() {
        return status;
    }


    public void deposito(double valor, int numeroConta) {
        if (!this.status) {
            throw new ContaException("Erro: a conta está fechada e a operação nao pode ser realizada.");
        } else {
            if (numeroConta == this.numeroConta) {
                System.out.println("Deposito na conta de " + getTitular() + " no valor de " + valor);
                saldo += valor;
            } else {
                throw new ContaException("Conta não encontrada.");
            }

        }
    }


    public void validarSaque(double valor) {
        if (!this.status) {
            throw new ContaException("Erro: a conta está fechada e a operação nao pode ser realizada.");
        }
        if (valor > saldo) {
            throw new ContaException("Saldo menor do que o valor solicitado.");
        }
    }

    public void fecharConta(int numeroConta) {

        if (numeroConta == this.numeroConta) {

            if (this.saldo < 0) {
                throw new ContaException("Erro: Para encerrar a conta necessário que o saldo nao seja devedor");
            }
            if (this.saldo > 0) {
                throw new ContaException("Erro: para encerrar a conta é nessario que nao exista saldo");
            } else {
                System.out.println("Conta: " + getNumeroConta() + " fechada.");
                this.status = false;
            }

        } else {
            throw new ContaException("Conta não encontrada.");
        }
    }


    public void abrirConta() {

        if (!tipoConta.equals("cp") && !tipoConta.equals("cc")) {
            throw new ContaException("Erro: tipo de conta inválido.");
        }
        if (tipoConta.equals("cc")) {
            System.out.println("Conta aberta com sucesso!");
            this.saldo = 50.00;
            this.status = true;
        }
        if (tipoConta.equals("cp")) {
            System.out.println("Conta aberta com sucesso!");
            this.saldo = 150.00;
            this.status = true;
        }


    }
    public abstract void saque(double valor, int numeroConta);

    public void statusAtual(int numeroConta){
        if (numeroConta == this.numeroConta){
            System.out.println("Tipo da conta: " + getTipoConta());
            System.out.println("Conta: " + getNumeroConta());
            System.out.println("Saldo: " + getSaldo());
            System.out.println("Titular: " + getTitular());
            System.out.println("Status: " + isStatus());
        }
        else {
            throw new ContaException("Conta não encontrada.");
        }
    }


}
