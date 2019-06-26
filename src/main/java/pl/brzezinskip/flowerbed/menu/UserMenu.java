package pl.brzezinskip.flowerbed.menu;

import pl.brzezinskip.flowerbed.dataBase.Flowerbed;
import pl.brzezinskip.flowerbed.flowers.CreateFlower;
import pl.brzezinskip.flowerbed.flowers.Flower;

import java.util.Scanner;

public class UserMenu {

    Scanner scanner = new Scanner(System.in);
    CreateFlower createFlower = new CreateFlower();
    Flowerbed flowerbed = new Flowerbed();

    int choice = -1;

    public void menu() {
        Option option = null;
        while (option != Option.EXIT) {
            showOptions();
            option = Option.createFromInt(scanner.nextInt());
            switch (option) {
                case CREATE_FLOWER:
                    Flower newFlower = createFlower.newFlower();
                    flowerbed.addFlower(newFlower);
                    break;
                case SHOW_FLOWERS:
                    flowerbed.showAllFlowers();
                    break;
                case FIND_FLOWER:
                    flowerbed.findFlower();
                    break;
                case EXIT:
                    System.out.println("Pa, pa!");
                    break;

            }
        }

        scanner.close();
    }

    private enum Option{
        EXIT(0, "wyjście z programu"),
        CREATE_FLOWER(1, "dodaj kwiatek"),
        SHOW_FLOWERS(2, "pokaż kwiatki"),
        FIND_FLOWER(3, "znajdź kwiatek");


        int option;
        String description;

        Option(int option, String description) {
            this.option = option;
            this.description = description;
        }

        @Override
        public String toString() {
            return option + " - " + description;
        }

        static Option createFromInt(int option){ //method must be visible outside enum class
            return Option.values()[option];
        }
    }

    private void showOptions() {
        for(Option o: Option.values()){
            System.out.println(o);
        }
    }

}
