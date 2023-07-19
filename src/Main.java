import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void getOS(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию для iOS");
            } else {
                System.out.println("Установите обычную версию для iOS");
            }
        } else if (os == 1) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию для Android");
            } else {
                System.out.println("Установите обычную версию для Android");
            }
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        int leapYear = sc.nextInt();
        checkLeapYear(leapYear);
    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вашу ОС: 0 - iOS, 1 - Android");
        int os = sc.nextInt();
        System.out.println("Введите год вашего устройства");
        int deviceYear = sc.nextInt();
        getOS(os, deviceYear);
    }

}