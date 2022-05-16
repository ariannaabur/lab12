package com.company;
import java.util.Scanner;

class Tovar {
    String Name,Proizvod;
    int Kol,Price;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in,"cp1251");
        System.out.println("Введите количество товаров=> ");
        int n=sc.nextInt();
        Tovar Tovar[]=new Tovar[n];
        System.out.println("Введите информацию о товарах: ");
        for (int i = 0; i < Tovar.length; i++) {
            sc.nextLine();
            Tovar[i]=new Tovar();
            System.out.print("Наименование "+(i+1)+"-го товара => ");
            Tovar[i].Name=sc.nextLine();
            System.out.print("Производитель "+(i+1)+"-го товара => ");
            Tovar[i].Proizvod=sc.nextLine();
            System.out.print("Количество "+(i+1)+"-го единиц =>");
            Tovar[i].Kol= (int) sc.nextDouble();
            System.out.print("Цена "+(i+1)+"-го товара =>");
        }
        System.out.println("\nИнформация о товарах:");
        for (int i = 0; i < Tovar.length; i++) {
            System.out.println(""+Tovar[i].Name+"\t"+Tovar[i].Proizvod +"\t"+Tovar[i].Kol+"\t"+Tovar[i].Price);
        }

        int indexMax = 0;
        double kolMax = Tovar[indexMax].Kol;
        for (int i=0; i<Tovar.length; i++){
            if (Tovar[i].Kol>kolMax){
                indexMax = i;
                kolMax = Tovar[indexMax].Kol;
            }
        }
        System.out.println("Товары с максимальным кол-во единиц ");
        System.out.println("Наименование " + Tovar[indexMax].Name + " с максимальным кол-во единиц " + kolMax);

        System.out.println("Средний рост женщин ="+);

        int nommax=0;
        double max=ludi[nommax].Rost;
        for (int i = 0; i < ludi.length; i++)
            if (ludi[i].Pol==1) {
                if (ludi[i].Rost>max) {
                    max = ludi[i].Rost;
                    nommax = i;
                }
            }
        System.out.println("\nСамый высокий мужчина :");
        System.out.println(""+ludi[nommax].Fam+"\t"+ludi[nommax].Name+"\t"+ludi[nommax].Rost+" см");

        for (int i = 0; i < ludi.length-1; i++)
            for (int j = 0; j < ludi.length-1-i; j++)
                if (ludi[j].Rost>ludi[j+1].Rost){
                    Ludi rab=ludi[j]; // rab – рабочая переменная для перестановки
                    ludi[j]=ludi[j+1];
                    ludi[j+1]=rab;
                }
        System.out.println("\nОтсортированный список по площади:");//
        for (int i = 0; i < ludi.length; i++) {
            System.out.println(""+ludi[i].Fam+"\t"+ludi[i].Name +"\t"+ludi[i].Rost+"см"+"\t"+ludi[i].Pol1);
        }
        sc.nextLine();
        System.out.println("Введите фамилию искомых людей=> ");
        String Fam=sc.nextLine();
        int nom=-1;

        for (int i = 0; i < ludi.length; i++)
            if (Fam.equalsIgnoreCase(ludi[i].Fam))
                nom=i;
        if (nom!= -1) {
            System.out.println("Такие люди есть в списке. Это "
                    +ludi[nom].Fam+"\t"+ludi[nom].Name +"\t"+ludi[nom].Rost+"см"+"\t"+ludi[nom].Pol1);
        }else System.out.println("Таких людей в списке нет");

    }
}
