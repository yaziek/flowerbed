package pl.brzezinskip.flowerbed.dataBase;

import pl.brzezinskip.flowerbed.flowers.Flower;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flowerbed implements Serializable {

    String fileName = "Flowers saved on Flowerbed.obj";

    FlowerWriter flowerWriter = new FlowerWriter();
    Scanner scanner = new Scanner(System.in);

    List<Flower> flowers = openList();

    //TODO class that allows to create your own flowerbed
   public String createNameForNewFlowerbed(){
       System.out.println("Podaj nazwę swojej rabaty:");
       String newName = scanner.nextLine();
       return newName;
   }

    public void saveList() {
        try (
                var fileOutputStream = new FileOutputStream(fileName);
                var objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(flowers);
            System.out.println("Zapisano rabatę do pliku :)");
        } catch (IOException o) {
            System.err.println("Nie udało się zapiać listy do pliku!");
            o.printStackTrace();
        }
    }

    //TODO create method to create new or open existings flowerbed from file
    //1. Jeśli masz już założoną rabatę wpisz jej imię
    //2. Jeżeli nie, stwórz nową

    public List<Flower> openList() {
        List<Flower> flowerbed = null;

        if(flowerbed == null){
            createNameForNewFlowerbed();
            saveList();
            return new ArrayList<>();
        }else {
            try (
                    var fileInputStream = new FileInputStream(fileName);
                    var objectInputStream = new ObjectInputStream(fileInputStream);
            ) {
                flowerbed = (List<Flower>) objectInputStream.readObject();

                System.out.println("Wczytano plik z Twoją rabatą :)");
            } catch (IOException | ClassNotFoundException o) {
                System.err.println("Nie udało się odczytać listy kwiatów z pliku!");
                o.printStackTrace();
            }
            return flowerbed;
        }
    }

    public void addFlower(Flower flower) {

        flowers.add(flower);
        flowerWriter.saveFlower(flower);
    }

    public void findFlower() {
        System.out.println("Podaj nazwę szukanej rośliny:");
        String flowerToFind = scanner.nextLine();
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).getName().equals(flowerToFind)) {
                System.out.println("Znaleziono: " + flowers.get(i).toString());
                break;
            }
        }
        System.out.println("Nie znaleziono takiego kwiatka"); //TODO remove this msg if flower didnt find

    }

    public void showAllFlowers() {
        if (flowers.size() != 0) {
            for (Flower flower : flowers) {
                System.out.println(flower);
            }
        } else {
            System.out.println("Nie ma żadnych kwiatów na Twojej rabacie!");
        }
    }
}
