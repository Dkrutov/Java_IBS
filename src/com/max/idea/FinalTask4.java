package com.max.idea;
import java.util.Scanner;
public class FinalTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        int count = 3;
        System.out.println("Количество попыток осталось: " + count);
        System.out.println("Введите ответ:");
        String otgadka = in.nextLine();
        if (otgadka.equals("Заархивированный вирус")) {
            count=0;
        } else if (otgadka.equals("Подсказка")) {
            System.out.println("Подсказка: Это не связано с луком");
            count=1;
            System.out.println("Количество попыток осталось: " + count);
        } else {
            System.out.println("Подумай еще!");
            count--;
            System.out.println("Количество попыток осталось: " + count);
        }
        while (count>=1) {
            System.out.println("Введите ответ:");
            otgadka = in.nextLine();
            if (otgadka.equals("Заархивированный вирус")) {
                break;
            } else if (otgadka.equals("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
                System.out.println("Количество попыток осталось: " + count);
            } else {
                count--;
                if (count==0) {
                    break;
                } else {
                    System.out.println("Подумай еще!");
                    System.out.println("Количество попыток осталось: " + count);
                }
            }
        }
        if (otgadka.equals("Заархивированный вирус")) {
            System.out.println("Правильно!");
        } else {
            System.out.println("Обидно, приходи в другой раз");
        }

    }
}
