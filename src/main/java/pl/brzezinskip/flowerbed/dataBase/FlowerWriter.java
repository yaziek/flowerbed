package pl.brzezinskip.flowerbed.dataBase;

import pl.brzezinskip.flowerbed.flowers.Flower;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FlowerWriter {

    // for testing purpose only
//    public static void main(String[] args) {
//
//        FlowerReader flowerReader = new FlowerReader();
//
//        Flower flower1 = new Flower("Chaber bławatek", "Centaurea cyanus", "astrowate", true );
//
//        saveFlower(flower1);
//        Flower flowerReaded = flowerReader.readFlower(flower1);
//
//        System.out.println(flowerReaded.toString());
//    }

    public static void saveFlower(Flower flower) { //TODO divide this class for smaller classes
        String flowerName = flower.getName().toString();
        String fileName = flowerName + ".obj";
        File file = new File(fileName);

        boolean fileExists = file.exists(); //check if the file exists
        if (!fileExists) { //if does not exists, create file
            try (
                    FileOutputStream fs = new FileOutputStream(fileName);
                    ObjectOutputStream os = new ObjectOutputStream(fs);
            ) {
                os.writeObject(flower);
                System.out.println("Zapisano roślinkę " + flowerName + " do pliku");
            } catch (IOException e) {
                System.err.println("Błąd zapisu " + fileName);
                e.printStackTrace();
            }
        }else { //if exists, print message
            System.out.println("Taka roślinka już istnieje!");
        }
    }
}
