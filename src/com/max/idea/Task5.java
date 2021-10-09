package com.max.idea;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число \"x\": ");
        double x = in.nextDouble();
        System.out.println("Введите число \"y\": ");
        double y = in.nextDouble();
        System.out.println("Введите знак операции \"+\" \"-\" \"*\" или \"/\": ");
        char z = in.next().charAt(0);
        System.out.printf("Ваши данные:\n Число \"x\": %.2f,\n Число \"y\": %.2f,\n Знак: %c \n", x,y,z);
        double o=0;
        switch (z) {
            case '+':
                o=x+y;
                System.out.println("Результат операции: " + o);
                break;
            case '-':
                o=x-y;
                System.out.println("Результат операции: " + o);
                break;
            case '*':
                o=x*y;
                System.out.println("Результат операции: " + o);
                break;
            case '/':
                if (y==0) {
                    System.out.println("Если указан знак \"/\", то  \"y\" не должен быть равен нулю");
                } else {
                    o=x/y;
                    System.out.println("Результат операции: " + o);
                }
                break;
            default:
            System.out.println("Введен неверный знак операции!");
        }
    }
}
