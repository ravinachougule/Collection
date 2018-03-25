package com.example.collectiondemojava;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by LENOVO on 24/03/2018.
 */

public class ListDemo {
    public static void list() {
        ArrayList<String> arrLst = new ArrayList<String>();
        arrLst.add("C");
        arrLst.add("CPP");
        arrLst.add("Java");
        arrLst.add("Dot net");
        arrLst.add(3, "Android");
        arrLst.add("Python");
        arrLst.add("Java");

        //display list using iterator
        System.out.println("display list using iterator");
        ListIterator<String> itr = arrLst.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //display reverse list using ieterator
        System.out.println("display reverselist using iterator");

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        //display list using for
        System.out.println("display list using for");

        for (String str : arrLst) {
            System.out.println(str);
        }
        arrLst.remove(2);
        arrLst.remove("Python");
        System.out.println("After removing element");

        for (String str : arrLst) {
            System.out.println(str);
        }
        arrLst.clear();
        System.out.println("list after clear");

        for (String str : arrLst) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        list();
    }
}
