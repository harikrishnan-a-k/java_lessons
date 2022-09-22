package demoProj.src;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Helloooooooo, World!");

        int myInt = 5;
        float myFloat = 5.24f;
        double myDouble = 5.67d;
        String outString = String.format("int:%2d ,float: %f , double : %f", myInt,myFloat,myDouble);
        System.out.println(outString);

        // pounds to kg
        System.out.println("enter value in pound");
        Scanner in = new Scanner(System.in);
        double pounds= in.nextDouble();
        double kg= pounds * 0.45359237;
        System.out.println("value in Kg ="+kg);

        // For more precision scenarios we use a class - BigDecimal.

        //  char type;
        char mychar = 'A';
        char mycharWithUniCode  = '\u0041';
        char copyRight ='\u00A9';
        System.out.println("mychar= "+mychar+" , mycharWithUnicode= "+mycharWithUniCode+"copyright = "+copyRight);

    }
}
