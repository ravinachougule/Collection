package com.example.collectiondemojava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by LENOVO on 24/03/2018.
 */
class Info{
    int rno;
    String name,address;
    Info(int rno,String name,String address){
        this.rno=rno;
        this.name=name;
        this.address=address;
    }
}
public class setDemo {
    static void set(){
        HashSet<String> hs=new HashSet<String>();
        hs.add("C");
        hs.add("cpp");
        hs.add("java");
        hs.add("cpp");
        hs.add("android");

        //displaying elements in set

        System.out.println("Displaying element in the set");
        Iterator<String> itr= hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        hs.remove("cpp");

        System.out.println("After removing element in the set");

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        hs.clear();
        System.out.println("After removing all element in the set");

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
    static void set1(){
        HashSet<Info> hs=new HashSet<Info>();
        Info i1=new Info(1,"Ravina","Ashta");
        Info i2=new Info(2,"Priya","Kolhapur");
        hs.add(i1);
        hs.add(i2);
        //"Dispalying set using for"
        System.out.println("Displaying set using for loop");
        for(Info i:hs){
            System.out.println(i.rno+" "+i.name+" "+i.address);
        }

    }
    public static void main(String[] args){
        set();
        set1();
    }
}
