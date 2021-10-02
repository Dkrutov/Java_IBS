package com.max.idea;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double x = in.nextDouble();
        System.out.println("Введите число y: ");
        double y = in.nextDouble();
        System.out.println("Введите число z: ");
        double z = in.nextDouble();
        double avr=(x+y+z)/3;
        System.out.printf("Ваши числа: x=%.2f, y=%.2f, z=%.2f \n", x,y,z);
        System.out.printf("Среднее арифметическое=%.2f \n", avr);
        int a = (int)Math.floor(avr/2);
        System.out.println("Сравниваемое значение с числом 3: " + a);
        if (a > 3)
            System.out.println("Программа выполнена корректно");
    }
}
