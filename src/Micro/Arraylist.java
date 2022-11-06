package Micro;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        for (int i = 0; i <=100 ; i+=2) {
            myNumbers.add(i);

        }

        System.out.println("myNumbers = " + myNumbers);
    }
    }

