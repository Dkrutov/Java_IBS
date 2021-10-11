package com.max.idea;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int lengthArray = in.nextInt();
        double[] array1 = new double[lengthArray];
        for (int i=0;i<lengthArray;i++) {
            System.out.println("Введите " + i + " элемент массива");
            array1[i]=in.nextDouble();
        }
        System.out.println("Массив заполнен!");
        double sum=0;
        for (int i=0;i<lengthArray;i++) {
            sum+=array1[i];
        }
        double avrArray=sum/lengthArray;
        System.out.println("Среднее арифметическое элементов массива = " + avrArray);
        for (int i=0;i<lengthArray;i++) {
            System.out.println("" + i + " элемент * ср.арифм.= " + array1[i]*avrArray);
        }
    }
}
