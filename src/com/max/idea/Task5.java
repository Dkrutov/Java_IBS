package com.max.idea;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        double x = in.nextDouble();
        System.out.println("Введите число: ");
        double y = in.nextDouble();
        System.out.println("Введите знак операции \"+\" \"-\" \"*\" или \"/\": ");
        String z = in.next();
        System.out.printf("Ваши данные:\n Число 1: %.2f,\n Число 2: %.2f,\n Знак: %s \n", x,y,z);
        double o=0;
        String a=null;
        switch (z) {
            case "+": o=x+y;
                System.out.println("Результат операции: " + o);
                break;
            case "-": o=x-y;
                System.out.println("Результат операции: " + o);
                break;
            case "*": o=x*y;
                System.out.println("Результат операции: " + o);
                break;
            case "/": o=x/y;
                System.out.println("Результат операции: " + o);
                break;
            default:
            System.out.println("Введен неверный знак операции!");
        }
    }
}
