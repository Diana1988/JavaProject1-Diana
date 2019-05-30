package com.company.lab2;

public class Main {
    public static void main(String[] args) {
     int substraction= dif(20,10);
     System.out.println(substraction);
        int multiplication= mult(3, 5);
        System.out.println(multiplication);
        int division= div(63, 7);
        System.out.println(division);


    }


    public static int dif(int firstNumber,int secondNumber){
        int result= firstNumber- secondNumber;
        return result;
    }
    public static int mult(int firstNumber, int secondNumber){
        int result=firstNumber*secondNumber;
        return result;
    }
    public static int  div( int firstNumber, int secondNumber){
        int result=firstNumber/secondNumber;
        return result;
    }


}

