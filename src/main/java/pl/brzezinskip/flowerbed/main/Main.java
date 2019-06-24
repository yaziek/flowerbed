package pl.brzezinskip.flowerbed.main;

import pl.brzezinskip.flowerbed.dataBase.FlowerReader;
import pl.brzezinskip.flowerbed.dataBase.FlowerWriter;
import pl.brzezinskip.flowerbed.dataBase.Flowerbed;
import pl.brzezinskip.flowerbed.flowers.Flower;
import pl.brzezinskip.flowerbed.menu.UserMenu;

public class Main {
    public static void main(String[] args) {

        Flower flower1 = new Flower("Chaber bławatek", "Centaurea cyanus", "astrowate", true );
        Flower flower2 = new Flower("Czarnuszka damasceńska", "Nigella damascena", "jaskrowate", false );

        UserMenu userMenu = new UserMenu();
        userMenu.menu();
    }
}
