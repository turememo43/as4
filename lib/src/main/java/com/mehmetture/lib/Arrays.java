package com.mehmetture.lib;

import java.util.ArrayList;
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

        //SET

        HashSet<String> mySet = new HashSet<String>();

        mySet.add("memo");
        mySet.add("memo");
        mySet.add("memo");

        System.out.println(mySet.size());


    }

}