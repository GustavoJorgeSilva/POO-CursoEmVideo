package com.cursoemvideo.cursopoocursoemvideo;

import com.cursoemvideo.cursopoocursoemvideo.entities.Caneta;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Aula03 {

    public static void main(String[] args) {


        Caneta caneta;
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.setPonta(0.5);
        c1.setCarga(80);
        c1.tampar();
        c1.destampar();
        c1.status();
        System.out.println(c1.getModelo());



    }

}
