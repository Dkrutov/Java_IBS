package com.max.idea;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String str = in.next();
        System.out.println("Введите второе число: ");
        int y = in.nextInt();
        int x = Integer.parseInt(str);
        int resultMax = Math.max(x,  y);
        double resultMin = Math.min(x,  y);
        System.out.println("Наиболешше из введнных чисел= " + resultMax);
        System.out.println("Наименьшее из введнных чисел = " + resultMin);
    }
}
