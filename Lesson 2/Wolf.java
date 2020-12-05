public class Wolf {

    private String gender;
    public String getGender() {
        return gender;
    }

    public void setGender(String a) {
        gender = a;
    }

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String b) {
        name = b;
    }

    private float weight;
    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float c) {
        weight = weight;
    }

    private float age;
    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        if(d >= 0 && d <= 8) {
            this.age = age;
        } else {
            System.out.println("Некорректный возраст");
        }
    }

    private String color;
    public String getColor() {
        return color;
    }

    public void setColor(String e) {
        color = e;
    }

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



