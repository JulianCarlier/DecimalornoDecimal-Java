package com.opdracht;

public class Main {
    public static void main(String[] args) {

        int numb1 = 2;
        double numb2 = 2.4;
        double anwser = numb1 + numb2;

        String result2 = evenordecimal(numb1, numb2, anwser);

        System.out.println(result2);
    }
    public static Boolean trueorfalse(double anwser) {
        if (anwser % 1 != 0) {
            return false;
        } else {
            return true;
        }
    }
    public static String evenordecimal (int numb1, double numb2, double anwser) {
        if (trueorfalse(anwser) == false ) {
            return numb1 + " + " + numb2 + " = " +  anwser  + " is een decimaal getal dus " + trueorfalse(anwser)  ;
        } else {
            return numb1 + " + " + numb2 + " = " +  anwser  + " is een rond getal dus " + trueorfalse(anwser) ;
        }
    }
}
