import java.util.List;

public class Forest {
    private List<MountainHare> hares; // или приват???
    private static String season;

    // объявите недостающие переменные и добавьте конструктор

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }

    public List<MountainHare> getHares() {
        return hares;
    }

    public void setHares(List<MountainHare> hares) {
        this.hares = hares;
    }

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    public static void setSeason(String newSeason) {
        if (newSeason.equals("зима")) {
            MountainHare.color = "Белый";
        } else {
            MountainHare.color = "Серо-рыжий";
        }
    }

    // добавьте метод printHares()
    public  void printHares() {
        for (MountainHare hare : hares ) {
            System.out.println(hare);
        }
    }

}