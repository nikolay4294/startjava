public class JaegerTest{

    public static void main(String[] args) {
        Jaeger jaegerRomeoBlue = new Jaeger();
        Jaeger jaegerGipsyDanger = new Jaeger();

        //Полиморфизм работает)
        jaegerRomeoBlue.setModelName("Romeo Blue");
        jaegerRomeoBlue.getModelName();
        jaegerRomeoBlue.drift("Romeo Blue");
        jaegerRomeoBlue.move();
        jaegerRomeoBlue.scanKaiju();
        jaegerRomeoBlue.useVortexCannon();
        jaegerGipsyDanger.drift("Gipsy Danger");
        jaegerGipsyDanger.move();
        jaegerGipsyDanger.scanKaiju();
        jaegerGipsyDanger.useVortexCannon();
        jaegerRomeoBlue.setOrigin("United States of America");
        jaegerGipsyDanger.setOrigin("United States of America");
        jaegerRomeoBlue.getOrigin();
        jaegerGipsyDanger.getOrigin();
    }
}
