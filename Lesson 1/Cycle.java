public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int i = 6;
        while(i >= -6) {
            System.out.println(i);
            i = i - 2;
        }

        int startRange = 10;
        int endRange = 20;
        int sum = 0;
        do {
            if(startRange % 2 != 0) {
                sum += startRange;
            }
            startRange++;
        } while(startRange <= endRange);
        System.out.println(sum);
    }
}
