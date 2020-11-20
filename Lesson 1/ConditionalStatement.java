public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if(age > 20) {
            System.out.println("Возраст больше 20");
        }

        boolean male = true;
        if(male) {
            System.out.println("Мужской пол");
        }

        if(!male) {
            System.out.println("Не мужской пол");
       }

        double height = 1.70;
        if(height < 1.80) {
            System.out.println("Рост меньше чем 1,8 метра");
        } else {
            System.out.println("Рост более чем 1,8 метра");
        }

        char firstLetterName = 'M';
        if(firstLetterName == 'М') {
              System.out.println("Имя начинается на букву М");
        } else if(firstLetterName == 'I') {
              System.out.println("Имя начинается на букву I");
        } else {
              System.out.println("Имя начинается на другую букву");
        }
    }
}

