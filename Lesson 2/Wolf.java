public class Wolf {

    private String gender;
    private String name;
    private float weight;
    private float age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        if(age >= 0 && age <= 8) {
            this.age = age;
        } else {
            System.out.println("Некорректный возраст");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Волк идет");
    }

    public void seat() {
        System.out.println("Волк сидит");
    }

    public void run() {
        System.out.println("Волк бежит");
    }

    public void howl() {
        System.out.println("Волк воет");
    }

    public void hunt() {
        System.out.println("Волк охотится");
    }
}
