class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender("мужской");
        wolf.setName("Чак");
        wolf.setWeight(12.6f);
        wolf.setAge(2.5f);
        wolf.setColor("белый");

        System.out.println("Пол волка - " + wolf.getGender);
        System.out.println("Имя волка - " + wolf.getName);
        System.out.println("Вес волка - " + wolf.getWeight + " кг");
        System.out.println("Возраст волка - " + wolf.getAge);
        System.out.println("Окрас волка - " + wolf.getColor);

        wolf.move();
        wolf.seat();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
