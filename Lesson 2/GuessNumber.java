public class GuessNumber {
    public int numComputer;

    public int randomComputerNum() {
        Random random = new Random();
        int numComputer = random.nextInt(100) + 1;
        return numComputer;
    }
}
