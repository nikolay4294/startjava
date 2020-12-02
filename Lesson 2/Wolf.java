public class Wolf {

    String gender;
    String name;
    float hieght;
    float weight;
    String color;

    public void move() {

    }

    public void seat() {

    }

    public void run() {

    }

    public void howl() {

    }

    public void hunt() {

    }
}

class WolfTest {

    public static void main(String[] args) {

        Wolf wolf = new Wolf();

        wolf.gender = "male";
        wolf.name = "Chak";
        wolf.hieght = 12.6f;
        wolf.weight = 32.5f;
        wolf.color = "white";

        System.out.println("Пол волка - " + wolf.gender);
        System.out.println("Имя волка - " + wolf.name);
        System.out.println("Рост волка - " + wolf.hieght);
        System.out.println("Вес волка - " + wolf.weight);
        System.out.println("Цвет волка - " + wolf.color);

        wolf.move();
        wolf.seat();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}

