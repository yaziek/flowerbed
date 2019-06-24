package pl.brzezinskip.flowerbed.dataBase;

import pl.brzezinskip.flowerbed.flowers.Flower;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flowerbed {

    FlowerWriter flowerWriter = new FlowerWriter();
    Scanner scanner = new Scanner(System.in);

    List<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower){

        flowers.add(flower);
        flowerWriter.saveFlower(flower);
    }

    public void findFlower(){
        System.out.println("Podaj nazwę szukanej rośliny:");
        String flowerToFind = scanner.nextLine();
        for (int i = 0; i < flowers.size(); i++) {
            if(flowers.get(i).getName().equals(flowerToFind)){
                System.out.println("Znaleziono: " + flowers.get(i).toString());
            }else {
                System.out.println("Nie znaleziono takiego kwiatka");
            }
        }
    }

    public void showAllFlowers(){
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }
}
