public class Calculator {
    public static void main(String[] args) {
        int introducedNumberOne = 10;
        int introducedNumberTwo = 15;
        String mathematicalOperation = "*";
        if(mathematicalOperation == "+") {
            System.out.println(introducedNumberOne + introducedNumberTwo);
        }

        else if(mathematicalOperation == "-") {
            System.out.println(introducedNumberOne - introducedNumberTwo);
        }

        else if(mathematicalOperation == "*") {
            System.out.println(introducedNumberOne * introducedNumberTwo);
        }

        else if(mathematicalOperation == "/") {
            System.out.println(introducedNumberOne / introducedNumberTwo);
        }

        else if(mathematicalOperation == "^") {
            long result = 1;
            for(int i = 1; i <= introducedNumberTwo; i++) {
                result = result * introducedNumberOne;
            }
            System.out.println(result);
        }

        else if(mathematicalOperation == "%") {
            System.out.println(introducedNumberOne % introducedNumberTwo);
        } else {
              System.out.println("Такого математического действия не существует. Введите корректный символ");
        }
    }
}
