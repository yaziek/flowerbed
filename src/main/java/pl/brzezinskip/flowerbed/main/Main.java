package pl.brzezinskip.flowerbed.main;

import pl.brzezinskip.flowerbed.dataBase.Flowerbed;
import pl.brzezinskip.flowerbed.flowers.Flower;
import pl.brzezinskip.flowerbed.menu.UserMenu;

public class Main {
    public static void main(String[] args) {

        Flower flower1 = new Flower("Chaber bławatek", "Centaurea cyanus", "astrowate", true );
        Flower flower2 = new Flower("Czarnuszka damasceńska", "Nigella damascena", "jaskrowate", false );

        Flowerbed flowerbed = new Flowerbed();
        UserMenu userMenu = new UserMenu();

        flowerbed.openList();
        userMenu.menu();
        flowerbed.saveList();

//        Declare the Club class as implementing Serializable:
//
//        public class Club implements Serializable {
//    ...
//        }
//        This tells the JVM that the class can be serialized to a stream. You don't have to implement any method, since this is a marker interface.
//
//        To write your list to a file do the following:
//
//        FileOutputStream fos = new FileOutputStream("t.tmp");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(clubs);
//        oos.close();
//        To read the list from a file, do the following:
//
//        FileInputStream fis = new FileInputStream("t.tmp");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        List<Club> clubs = (List<Club>) ois.readObject();
//        ois.close();
    }
}
