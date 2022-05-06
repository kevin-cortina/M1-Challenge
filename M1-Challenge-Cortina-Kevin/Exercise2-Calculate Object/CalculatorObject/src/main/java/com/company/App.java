package com.company;

public class App {
    public static void main(String[] args) {

        int int1 = Calculator.addition(1,1);
        int int2 = Calculator.subtraction(23,52);
        int int3 = Calculator.multiplication(34,2);
        int int4 = Calculator.division(12,3);
        double int5 = Calculator.dblDivision(12,7);
        double int6 = Calculator.dblAddition(3.4,2.3);
        double int7 = Calculator.dblMultiplication(6.7,4.4);
        double int8 = Calculator.dblSubtraction(5.5,0.5);
        double int9 = Calculator.dblDivision(10.8,2.2);

        System.out.println("1+1=" + int1);
        System.out.println("23-52=" + int2);
        System.out.println("34*2=" + int3);
        System.out.println("12/3=" + int4);
        System.out.println("12/7=" + int5);
        System.out.println("3.4+2.3=" + int6);
        System.out.println("6.7*4.4=" + int7);
        System.out.println("5.5-0.5=" + int8);
        System.out.println("10.8/2.2=" + int9);
    }
}
