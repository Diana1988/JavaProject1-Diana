package com.company;

import com.sun.source.util.SourcePositions;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int x=4;
        Integer y= 4;

        List<Integer> myList= new ArrayList<>();
        for(int i=1; i<=100; i++){
            myList.add(i);
        }
        System.out.println(myList.get(99));
    }



        }



