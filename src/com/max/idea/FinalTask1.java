package com.max.idea;
import java.util.Scanner;
public class FinalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара:");
        double dolrub = in.nextDouble();
        System.out.println("Введите количество рублей: ");
        double rub = in.nextDouble();
        double dol = rub * dolrub;
        System.out.printf("Курс доллара: %.2f %nКоличество рублей: %.2f %nИтого: %.2f долларов", dolrub,rub,dol);
    }
}
