package com.cursoemvideo.cursopoocursoemvideo;

import com.cursoemvideo.cursopoocursoemvideo.entities.Conta;
import com.cursoemvideo.cursopoocursoemvideo.entities.ContaException;

public class Aula05 {
    public static void main(String[] args) {

        try {
            Conta c1 = new Conta(1001, "Gustavo", -6.0, 500);
            c1.deposito(1000);
            c1.saque(600);
            System.out.println(c1.getSaldo());
        }
        catch (ContaException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
