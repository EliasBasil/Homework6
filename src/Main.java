public class Main {
    public static void main(String[] args) {
        // Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 3
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 5
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 6
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 8
        int salary = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // Задача 9
        int totalWithInterest = 0;
        for (int i = 1; i <= 12; i++) {
            totalWithInterest += totalWithInterest / 100;
            totalWithInterest += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalWithInterest + " рублей");
        }

        // Задача 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}