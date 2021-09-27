package com.max.idea;

public class Main    {
    public static void main(String[] args) {
        /* Задача №1 - Первая программа */
        System.out.println("Hello World!");
        /* Задача №2 - Типы данных */
        double a = 3.1416;
        byte b = 127;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        /* Задача №3_ Массивы */
        int[] array1 = new int[] {1,2,3,4,5};
        System.out.println("Элемент №0: " + array1[0]);
        System.out.println("Элемент №4: " + array1[array1.length-1]);
        int c;
        int sum;
        c=array1[0];
        array1[0]=array1[array1.length-1];
        array1[array1.length-1]=c;
        System.out.println("Элемент №0: " + array1[0]);
        System.out.println("Элемент №4: " + array1[4]);
        sum = array1[0] + array1[array1.length/2];
        System.out.println("Сумма последнего и среднего элемента: " + sum);
    }
}
