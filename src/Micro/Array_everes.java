package Micro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array_everes {
    public static void main(String[] args) {
         /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 1 den büyük basamaklı bir sayı giriniz :  ");
        long b = sc.nextLong();


        String num[] = Long.toString(b).split("");

        ArrayList<String> a = new ArrayList<String>(Arrays.asList(num));

        Collections.reverse(a);
        System.out.println("a.size() = " + a.size());
        System.out.println("a = " + a);


        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));

        }


    }
}
