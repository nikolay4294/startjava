public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private Float height;
    private Float weight;
    private int speed;
    private int strength;
    private int armor;

    public void setModelName(String modelName) {
            this.modelName = modelName;
    }

    public String getModelName() {
            return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getWeight() {
        return weight;
    }

    boolean drift(String jaegerName) {
        System.out.println("Метод drift, робота " + jaegerName + " корректно отработал");
        return true;
    }

    void move() {
        System.out.println("Метод move корректно отработал");
    }

    String scanKaiju() {
        System.out.println("Метод scanKaiju корректно отработал");
        return "Обнаружен Kaiju";
    }

    void useVortexCannon() {
        System.out.println("Метод useVortexCannon корректно отработал");
    }
}
