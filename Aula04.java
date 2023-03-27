package com.cursoemvideo.cursopoocursoemvideo;

import com.cursoemvideo.cursopoocursoemvideo.entities.Caneta;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula04 {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();

        c1.setModelo("Bic");
        c1.setCor("Azul");
        c1.setPonta(0.5);
        c1.setCarga(70);

        c1.destampar();
        c1.status();

    }
}
