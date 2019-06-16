package pl.brzezinskip.flowerbed.dataBase;

import pl.brzezinskip.flowerbed.flowers.Flower;

import java.util.ArrayList;
import java.util.List;

public class Flowerbed {

    List<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    public void showAllFlowers(){
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }
}
