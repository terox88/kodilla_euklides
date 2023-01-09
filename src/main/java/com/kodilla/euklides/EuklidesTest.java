package com.kodilla.euklides;
import java.util.*;
public class EuklidesTest {
    public static void main (String[] args) {
        EuklidesAlgorithm euklides = new EuklidesAlgorithm();
        int basicResult = euklides.basicAlgorithm(112, 56);
        System.out.println(" Basic: " + basicResult);
        int moduloResult = euklides.moduloAlgorithm(112, 56);
        System.out.println("Modulo: " + moduloResult);
        Random generator = new Random();
        int a = 0;
        int b = 0;
        for (int i = 0; i < 20000; i++) {
            a = generator.nextInt(2000);
            b =generator.nextInt(2000);
            basicResult = euklides.basicAlgorithm(a, b);
            moduloResult = euklides.moduloAlgorithm(a, b);
            if(basicResult != moduloResult) {
                System.out.println("Error on loop " + i + 1 + " for " + basicResult + " and " + moduloResult);
            }
        }
    }
}
