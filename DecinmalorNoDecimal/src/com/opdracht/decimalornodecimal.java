package com.opdracht;

public class decimalornodecimal {

    public static void main(String[] args) {
        double numb1 = 2.5;
        double numb2 = 2.2;

        boolean result = evenordecimal(numb1, numb2);

        System.out.println(result);
}
    public static boolean evenordecimal(double numb1, double numb2) {
        double anwser = numb1 + numb2;
        if (anwser % 1 != 0) {
            return false;
        } else {
            return true;
        }
    }
}