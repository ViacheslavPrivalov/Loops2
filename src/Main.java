public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        extraTask1();
        extraTask2();
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

    public static void task4() {
        System.out.println("Задача4");
        double percent = 0.07;
        int deposit = 15_000;
        int month = 0;
        while (deposit <= 12_000_000) {
            month++;
            deposit += deposit * percent;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println(month);
    }

    public static void task5() {
        System.out.println("Задача5");
        double percent = 0.07;
        int deposit = 15_000;
        int month = 0;
        while (deposit <= 12_000_000) {
            month++;
            deposit += deposit * percent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача6");
        double percent = 0.07;
        int deposit = 15_000;
        int month = 0;
        while (month <= 9 * 12) {
            month++;
            deposit += deposit * percent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
        System.out.println(deposit);
    }

    public static void task7() {
        System.out.println("Задача7");
        int friday = 3;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача8");
        int currentYear = 2023;
        int previousYears = 200;
        int nextYears = 100;
        int cometYear = 0;
        for (; cometYear <= currentYear + nextYears; cometYear += 79) {
            if (cometYear >= currentYear - previousYears) {
                System.out.println(cometYear);
            }
        }
    }

    public static void extraTask1() {
        System.out.println("Extra task 1");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println(i + ": ping");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println(i + ": pong");
                continue;
            }
            System.out.println(i + ":");
        }
    }

    public static void extraTask2() {
        System.out.println("Extra task 2");
        int num1 = 0;
        int num2 = 1;
        int rez;
        System.out.print(num1 + " " + num2 + " ");
        do {
            rez = num1 + num2;
            num1 = num2;
            num2 = rez;
            System.out.print(rez + " ");
        } while (rez < 34);
    }
}
