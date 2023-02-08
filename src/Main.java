public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
//        task1();
//        task1();
//        task1();
//        task1();
//        task1();
    }

    public static void task1() {
        System.out.println("Задача1");
        int sumOfSavings = 15_000;
        int deposit = 0;
        int month = 0;
        while (deposit <= 2_459_000) {
            deposit += sumOfSavings;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача3");
        int totalPopulation = 12_000_000;
        int numOfBirths = (totalPopulation / 1000) * 17;
        int numOfDeaths = (totalPopulation / 1000) * 8;
        for (int i = 1; i <= 10; i++) {
            totalPopulation = totalPopulation + numOfBirths - numOfDeaths;
            System.out.println("Год " + i + ", численность населения составляет " + totalPopulation);
        }
    }
}