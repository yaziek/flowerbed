package pl.brzezinskip.flowerbed.main;

import pl.brzezinskip.flowerbed.flower.Flower;

public class Main {
    public static void main(String[] args) {

        Flower flower1 = new Flower("Chaber bławatek", "Centaurea cyanus", "astrowate", true );

        System.out.println(flower1.toString());
    }
}
