package com.cursoemvideo.cursopoocursoemvideo;

import com.cursoemvideo.cursopoocursoemvideo.entities.Conta;
import com.cursoemvideo.cursopoocursoemvideo.entities.ContaCorrente;
import com.cursoemvideo.cursopoocursoemvideo.entities.ContaException;
import com.cursoemvideo.cursopoocursoemvideo.entities.ContaPoupanca;

public class Aula05 {
    public static void main(String[] args) {

        try {
            ContaCorrente cc = new ContaCorrente(1000, "Gustavo", "cc", 5.0,0.0);
            cc.abrirConta();
            cc.deposito(100,1000);

            cc.statusAtual(1000);

            System.out.println();


            ContaPoupanca cp = new ContaPoupanca(1002, "Mah", "cp", 5.0,0.0);
            ContaPoupanca cp2 = new ContaPoupanca(1003,"Guh","cp",5.0,0.0);
            cp2.abrirConta();
            cp.abrirConta();
            cp.deposito(500,1002);
            cp.saque(300,1002);

            cp.statusAtual(1002);
            System.out.println();

            cp2.deposito(300,1003);
            cp2.saque(200,1003);
            cp2.statusAtual(1003);
            System.out.println();

            ContaPoupanca contaPoupanca = new ContaPoupanca();
            contaPoupanca.setNumeroConta(1005);
            contaPoupanca.setTitular("joao");
            contaPoupanca.setTipoConta("cp");

            contaPoupanca.abrirConta();
            contaPoupanca.saque(100,1005);
            contaPoupanca.statusAtual(1005);


        } catch (ContaException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
