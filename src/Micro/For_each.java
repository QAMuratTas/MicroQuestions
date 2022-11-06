package Micro;

import java.util.ArrayList;

public class For_each {
    public static void main(String[] args) {

                           String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
                for (String i : cars) {
                    System.out.println(i);
                }
                String [] books ={"Dura MAter","Pia Mater","Arachnoid Mater"};


        ArrayList<String> list = new ArrayList<String>();



        for (int i = 0; i < books.length ; i++) {
            list.add(books[i]);

                    }
        System.out.println("list = " + list);


    }
        }









