package com.max.idea;

public class Task3 {
    public static void main(String[] args) {
        /* Задача №3_ Массивы */
        int[] array1 = new int[] {1,2,3,4,5};
        System.out.println("Элемент №0: " + array1[0]);
        System.out.println("Элемент №4: " + array1[array1.length-1]);
        int c=array1[0];
        array1[0]=array1[array1.length-1];
        array1[array1.length-1]=c;
        System.out.println("Элемент №0: " + array1[0]);
        System.out.println("Элемент №4: " + array1[4]);
        int sum = array1[0] + array1[(array1.length-1)/2];
        System.out.println("Сумма последнего и среднего элемента: " + sum);
    }
}
