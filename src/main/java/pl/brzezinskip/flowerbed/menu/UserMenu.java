package pl.brzezinskip.flowerbed.menu;

import pl.brzezinskip.flowerbed.dataBase.Flowerbed;
import pl.brzezinskip.flowerbed.flowers.CreateFlower;
import pl.brzezinskip.flowerbed.flowers.Flower;

import java.util.Scanner;

public class UserMenu {

    Scanner scanner = new Scanner(System.in);
    CreateFlower createFlower = new CreateFlower();
    Flowerbed flowerbed = new Flowerbed();

    public static final int EXIT = 0;
    public static final int CREATE_FLOWER = 1;
    public static final int SHOW_FLOWERS= 2;

    int choice = -1;

    public void menu(){
        while (choice != EXIT) {
            showChoices();
            choice = scanner.nextInt();
            switch (choice) {
                case CREATE_FLOWER:
                    Flower newFlower = createFlower.newFlower();
                    flowerbed.addFlower(newFlower);
                    break;
                case SHOW_FLOWERS:
                    flowerbed.showAllFlowers();
                    break;
                case EXIT:
                    System.out.println("Pa, pa!");
                    break;
            }
        }
    }

    private void showChoices(){
        System.out.println("Co chcesz zrobić?");
        System.out.println(CREATE_FLOWER + " - dodaj kwiatek");
        System.out.println(SHOW_FLOWERS + " - pokaż kwiaty");
        System.out.println(EXIT + " - wyjście z programu");
    }

}
