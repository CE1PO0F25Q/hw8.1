import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println(" задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i = i + 1;
        }
        System.out.println(" месяц " + i + ", сумма накоплений равна " + total);

    }

    public static void task2() {
        System.out.println(" задача 2 ");
        int y = 1;
        int max = 10;
        while (y <= max) {
            System.out.print(y + "  ");
            y = y + 1;
        }

        System.out.println();

        for (int x = 10; x > 0; x = x - 1) {
            System.out.print(x + "  ");
        }
    }

    public static void task3() {
        System.out.println(" задача 3 ");
        int totalPeople = 12_000_000;
        int fertility = 8;
        int mortality = 17;
        int increasePerYear = 0;
        int populationDecline = 0;
        for (int year = 1; year <= 10; year++) {
            increasePerYear = totalPeople / 1000 * mortality;
            populationDecline = totalPeople / 1000 * fertility;
            totalPeople = totalPeople + increasePerYear - populationDecline;
            System.out.println("Год " + year + ", численность населения составляет " + totalPeople);
        }



    }


}
