package com.cursoemvideo.cursopoocursoemvideo;

import com.cursoemvideo.cursopoocursoemvideo.entities.FoneDeOuvido;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio1 {
    public static void main(String[] args) {

        FoneDeOuvido f1 = new FoneDeOuvido();
        f1.setModelo("Razer");
        f1.setCor("Preto");
        f1.setVolume(110);
        f1.mudarVolume(70);
        System.out.println(f1.getVolume());

    }
}
