public class Wolf {

    String gender;
    String name;
    float weight;
    float age;
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

        wolf.gender = "мужской";
        wolf.name = "Чак";
        wolf.weight = 12.6f;
        wolf.age = 2.5f;
        wolf.color = "белый";

        System.out.println("Пол волка - " + wolf.gender);
        System.out.println("Имя волка - " + wolf.name);
        System.out.println("Вес волка - " + wolf.weight + " кг");
        System.out.println("Возраст волка - " + wolf.age);
        System.out.println("Окрас волка - " + wolf.color);

        wolf.move();
        wolf.seat();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}

