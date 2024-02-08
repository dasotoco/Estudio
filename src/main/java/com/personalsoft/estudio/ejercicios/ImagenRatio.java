package com.personalsoft.estudio.ejercicios;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ImagenRatio {

    public static void main(String[] args){
        BufferedImage  image;
        URL urlImage;

        try {
            urlImage = new URL("https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png");
            image = ImageIO.read(urlImage);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(image.getHeight() + " " + image.getWidth());

    }
}
