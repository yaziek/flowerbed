package pl.brzezinskip.flowerbed.flowers;

import java.util.Scanner;

public class CreateFlower {

    Scanner scanner = new Scanner(System.in);

    public Flower newFlower() {
        System.out.println("Podaj nazwę:");
        String name = scanner.nextLine();
        System.out.println("Podaj łacińską nazwę:");
        String systematicName = scanner.nextLine();
        System.out.println("Podaj rodzinę:");
        String family = scanner.nextLine();
        System.out.println("Czy kwiat jest jednoroczny?");
        boolean annual = checkIfAnnual();

        return new Flower(name, systematicName, family, annual);

    }

    private boolean checkIfAnnual() {
        boolean checkIfTrue = true;
        boolean correctAnswer = false;
        while (!correctAnswer) {
            String answer = scanner.nextLine();
            if (answer.equals("tak")) {
                checkIfTrue = true;
                correctAnswer = true;
            } else if (answer.equals("nie")) {
                checkIfTrue = false;
                correctAnswer = true;
            } else {
                System.out.println("Możesz odpowiedzieć tylko tak lub nie, spróbuj jeszcze raz:");
                correctAnswer = false;
            }
        }
        return checkIfTrue;
    }
}

