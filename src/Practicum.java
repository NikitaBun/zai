import java.util.List;

public class Practicum {

    public static void main(String[] args) {
        Forest forest = new Forest();
        List<MountainHare> hares = List.of(
                new MountainHare(4, 4.4, 120),
                new MountainHare(7, 3.6, 150),
                new MountainHare(1, 2.3, 100)
        );

        System.out.println("В лесу лето!");
        // создайте объект "летний лес с зайцами"
        forest.setSeason("лето");

        System.out.println("Список зайцев:");
     // напечатайте список всех зайцев
        forest.printHares();
        System.out.println("В лесу зима!");
        // поменяйте время года на зиму
        forest.setSeason("зима");
        forest.printHares();
        // напечатайте список всех зайцев
    }

}
