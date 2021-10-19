package com.max.idea;
import java.util.Scanner;
public class FinalTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число строк:");
        int n = in.nextInt();
        String[] arrayStrok = new String[n];
        for (int i=0;i<n;i++) {
        System.out.println("Введите строку " + (i+1));
        arrayStrok[i] = in.next();
        }
        int[] arrayСountUniqSym = new int[n];
        for (int i=0;i<n;i++) {
            System.out.println("Строка " + (i+1) + ": " + arrayStrok[i]);
            int countUniqSym = countUniqSym(arrayStrok[i]);
            arrayСountUniqSym[i]=countUniqSym;
        }
        int max=arrayСountUniqSym[0];
        int num=0;
        for (int i=0;i<n;i++) {
            if (arrayСountUniqSym[i] > max) {
                max = arrayСountUniqSym[i];
                num=i;
            }

        }
        System.out.println("Ответ: " + arrayStrok[num]);
        System.out.println("Число уникальных символов: " + max);
    }
    // Метод подсчета уникальных символов
    public static int countUniqSym(String Stroka){
        String buffer ="";
        for (int j = 0; j < Stroka.length(); j++) {
            if (!buffer.contains(String.valueOf(Stroka.charAt(j)))) {
                buffer += Stroka.charAt(j);
            }
        }
        return buffer.length();
    }

}


