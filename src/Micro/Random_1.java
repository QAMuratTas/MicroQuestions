package Micro;

import java.util.ArrayList;
import java.util.Scanner;

public class Random_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Rastgele türeteceğim sayı miktarını giriniz : ");
        int boyut = sc.nextInt();
        for (int i = 0; i < boyut; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("Rastgele türettiğim sayıların listesi: " + list);
        int count = 0;
        for (int i = 0; i < boyut; i++) {
            if (list.get(i) % 2 == 1) {
                count++;
                if (count == boyut) {
                    System.out.println("Rastgele oluşturulan sayılar arasında çift sayı yoktur...");
                }
            }
        }
        System.out.println("Çift sayıların çarpımı = " + carpım(list));
    }
    private static int carpım(ArrayList<Integer> list) {
        int crp = 1;
        for (int d : list) {
            if (d % 2 == 0) {
                crp *= d;
            }
            ArrayList<Integer> s = new ArrayList<Integer>();
            for (int i = 0; i < list.size(); i++) {
            }
        }
        return crp;
    }
}