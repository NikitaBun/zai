import java.util.List;

public class Forest {
    public List<MountainHare> hares; // или приват???
    private static String season;



    // объявите недостающие переменные и добавьте конструктор

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    public static void setSeason(String newSeason) {
        //Forest.season = season;
        if (season =="зима") {
            MountainHare.color = "Белый";
        } else {
            MountainHare.color = "Серо-рыжий";
        }
    }

    // добавьте метод printHares()
    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }

}