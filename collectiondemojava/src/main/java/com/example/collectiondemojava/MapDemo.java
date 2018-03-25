package com.example.collectiondemojava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by LENOVO on 24/03/2018.
 */

public class MapDemo {
    static void map(){
        Map<Integer,String> mp= new HashMap<Integer,String>();
        mp.put(1,"C");
        mp.put(2,"cpp");
        mp.put(4,"java");
        mp.put(5,"Cpp");

        System.out.println("Displaying map elements using for loop(new method)");

        for(Map.Entry m:mp.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        mp.put(3,"android");
   //     mp.replace(5,"cpp","android");
        mp.remove(5);

        System.out.println("Displaying map elements using iterator(old method)");
        Set s=mp.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            Map.Entry entr=(Map.Entry)itr.next();
            System.out.println(entr.getKey()+" "+entr.getValue());
        }
        mp.clear();
        if (mp.isEmpty()){
            System.out.println("Map is empty");
        }
        else{
            while(itr.hasNext()){
                Map.Entry entr=(Map.Entry)itr.next();
                System.out.println(entr.getKey()+" "+entr.getValue());
            }
        }
    }

    public static void main(String[] args){
        map();
    }
}
