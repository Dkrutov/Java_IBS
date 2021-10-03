package com.max.idea;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int units = in.nextInt();
        if (units==2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int dist = in.nextInt();
            System.out.println("Введите число");
            int num = in.nextInt();
            double[] arraydist = dist(dist,num);
            System.out.printf("Результат:\n Метры:%.5f \n Мили:%.5f \n Ярды:%.5f \n Футы:%.5f \n", arraydist[0],arraydist[1],arraydist[2],arraydist[3]);
        }
            else if (units==1){
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция, 4 - пуд");
            int mass = in.nextInt();
            System.out.println("Введите число");
            int num = in.nextInt();
            double[] arraymass = mass(mass,num);
            System.out.printf("Результат:\n Килограммы:%.5f \n Фунты:%.5f \n Унции:%.5f \n Пуды:%.5f \n", arraymass[0],arraymass[1],arraymass[2],arraymass[3]);
        } else {
            System.out.println("Некорректные данные!");
        }
    }
    // Метод dist, рассчитывает меры дистанции
    public static double[] dist(int dist, double num){
        double[] arraykofdist = {0.0006214,1.09361,3.28083,1609.344,1760,5280,0.9144,0.00056,3,0.33333,0.00018,0.3048};
        double[] arraydist = new double[4];
        double metrmila,metryard,metrfut,milametr,milayard,milafut,yardmetr,yardmila,yardfut,futyard,futmila,futmetr;
        if (dist==1){
            metrmila = arraykofdist[0] * num;
            metryard = arraykofdist[1] * num;
            metrfut = arraykofdist[2] * num;
            arraydist[0] = num;
            arraydist[1] = metrmila;
            arraydist[2] = metryard;
            arraydist[3] = metrfut;
            return arraydist;
        } else if (dist==2) {
            milametr = arraykofdist[3] * num;
            milayard = arraykofdist[4] * num;
            milafut = arraykofdist[5] * num;
            arraydist[0] = milametr;
            arraydist[1] = num;
            arraydist[2] = milayard;
            arraydist[3] = milafut;
            return arraydist;
        } else if (dist==3) {
            yardmetr = arraykofdist[6] * num;
            yardmila = arraykofdist[7] * num;
            yardfut = arraykofdist[8] * num;
            arraydist[0] = yardmetr;
            arraydist[1] = yardmila;
            arraydist[2] = num;
            arraydist[3] = yardfut;
            return arraydist;
        } else if (dist==4) {
            futyard = arraykofdist[9] * num;
            futmila = arraykofdist[10] * num;
            futmetr = arraykofdist[11] * num;
            arraydist[0] = futmetr;
            arraydist[1] = futmila;
            arraydist[2] = futyard;
            arraydist[3] = num;
            return arraydist;
        }
        return arraydist;
    }
    // Метод mass, рассчитывает меры массы
    public static double[] mass(int mass, double num){
        double[] arraykofmass = {2.44192,35.27396,0.06104,0.45359,16,0.02769,0.06922,0.02834,0.00173,577.80500,40,16.38049};
        double[] arraymass = new double[4];
        double kgfunt,kgunc,kgpud,funtkg,funtunc,funtpud,uncfunt,unckg,uncpud,pudunc,pudfunt,pudkg;
        if (mass==1){
            kgfunt = arraykofmass[0] * num;
            kgunc = arraykofmass[1] * num;
            kgpud = arraykofmass[2] * num;
            arraykofmass[0] = num;
            arraykofmass[1] = kgfunt;
            arraykofmass[2] = kgunc;
            arraykofmass[3] = kgpud;
            return arraymass;
        } else if (mass==2) {
            funtkg = arraykofmass[3] * num;
            funtunc = arraykofmass[4] * num;
            funtpud = arraykofmass[5] * num;
            arraymass[0] = funtkg;
            arraymass[1] = num;
            arraymass[2] = funtunc;
            arraymass[3] = funtpud;
            return arraymass;
        } else if (mass==3) {
            uncfunt = arraykofmass[6] * num;
            unckg = arraykofmass[7] * num;
            uncpud = arraykofmass[8] * num;
            arraymass[0] = uncfunt;
            arraymass[1] = unckg;
            arraymass[2] = num;
            arraymass[3] = uncpud;
            return arraymass;
        } else if (mass==4) {
            pudunc = arraykofmass[9] * num;
            pudfunt = arraykofmass[10] * num;
            pudkg = arraykofmass[11] * num;
            arraymass[0] = pudkg;
            arraymass[1] = pudfunt;
            arraymass[2] = pudunc;
            arraymass[3] = num;
            return arraymass;
        }
        return arraymass;
    }
}
