import java.util.List;

public class Practicum {

    public static void main(String[] args) {
        List<MountainHare> hares = List.of(
                new MountainHare(4, 4.4, 120),
                new MountainHare(7, 3.6, 150),
                new MountainHare(1, 2.3, 100)
        );
        Forest forest = new Forest(hares);

        System.out.println("В лесу лето!");
        // создайте объект "летний лес с зайцами"
        Forest.setSeason("лето");
        System.out.println("Список зайцев:");
     // напечатайте список всех зайцев
        forest.printHares();
        System.out.println("В лесу зима!");
        System.out.println("Список зайцев:");

        // поменяйте время года на зиму
        Forest.setSeason("зима");
        forest.printHares();
        // напечатайте список всех зайцев
    }

}
