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
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 2; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            int proverka1 = i % 100;
            int proverka2 = i % 400;
            if (proverka1 != 0 || proverka2 == 0) {
                System.out.println("Високосный год " + i);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int deposit = 0;
        for (int i = 1; i <= 12; i++) {
            deposit = deposit + 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + deposit + " рублей.");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        double deposit = 0.0;
        double input = 29000.0;
        for (int i = 1; i <= 12; i++) {
            deposit = deposit + input;
            deposit = deposit + deposit / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + Math.round(deposit) + " рублей.");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            int number = 2 * i;
            System.out.println("2 * " + i + " = " + number);
        }
    }
}