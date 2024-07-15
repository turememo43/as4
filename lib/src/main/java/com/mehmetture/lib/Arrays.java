package com.mehmetture.lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args) {

        //ARRAY

        String[] myStringArray = new String[3];

        myStringArray[0] = "Mehmet";
        myStringArray[1] = "Mete";
        myStringArray[2] = "Ibrahim";

        System.out.println(myStringArray[0]);

        int[] myIntegerArray = new int[3];

        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;

        System.out.println(myIntegerArray[0]);

        int[] myNumberArray = {1,2,3,4,5,6,7};

        System.out.println(myNumberArray[3]);


        //LISTS


        ArrayList<String> myCars = new ArrayList<String >();

        myCars.add("Ford");
        myCars.add("Reno");
        myCars.add("Porsche");

        System.out.println(myCars.get(0));
        System.out.println(myCars.get(1));
        System.out.println(myCars.get(2));

        ArrayList<String> myBookS = new ArrayList<String>();

        myBookS.add("Dune");
        myBookS.add("Falcon");
        myBookS.add("Android");

        System.out.println(myBookS.get(0));
        System.out.println(myBookS.get(1));
        System.out.println(myBookS.get(2));



        //SET

        HashSet<String> mySet = new HashSet<String>();

        mySet.add("memo");
        mySet.add("memo");
        mySet.add("memo");

        System.out.println(mySet.size());


        //HASHMAP

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("name1", "mehmet");
        myHashMap.put("name2", "asli");
        myHashMap.put("name3", "orkun");

        myHashMap.put("cars1", "taycan");
        myHashMap.put("cars2", "focus");
        myHashMap.put("cars3", "insignie");

        System.out.println(myHashMap.get("name1"));
        System.out.println(myHashMap.get("name2"));
        System.out.println(myHashMap.get("name3"));
        System.out.println(myHashMap.get("cars1"));
        System.out.println(myHashMap.get("cars2"));
        System.out.println(myHashMap.get("cars3"));



        HashMap<String, Integer> MySecondHashMap = new HashMap<String, Integer>();

        MySecondHashMap.put("run",200);
        MySecondHashMap.put("football",400);
        MySecondHashMap.put("swim",300);

        System.out.println(MySecondHashMap.get("football"));
        System.out.println(MySecondHashMap.get("swim"));
        System.out.println(MySecondHashMap.get("run"));







    }

}