package pl.brzezinskip.flowerbed.dataBase;

import pl.brzezinskip.flowerbed.flowers.Flower;

import java.io.*;

public class FlowerReader {

    //TODO divide for smaller classes
    public static Flower readFlower(Flower flower) {
        String fileName = flower.getName() + ".obj";
        Flower flowerToRead = null;
        File file = new File(fileName);

        boolean fileExists = file.exists();

        if (fileExists) {

            try (
                    var fileInputStream = new FileInputStream(fileName);
                    var objectInputStream = new ObjectInputStream(fileInputStream);
            ) {
                flowerToRead = (Flower) objectInputStream.readObject();
            } catch (ClassNotFoundException | IOException e) {
                System.err.println("Nie udało się odczytać pliku");
                e.printStackTrace();
            }
        } else {
            System.err.println("Roślinka o takiej nazwie nie istnieje w bazie danych :(");
        }

        return flowerToRead;
    }
}
