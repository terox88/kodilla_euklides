package com.kodilla.euklides;

public class EuklidesAlgorithm {
    public int basicAlgorithm (int a, int b) {

        while(a != b) {
            if(a > b) {
                a -= b;

            } else {
                b -= a;
            }
        }
        return a;
    }

    public int moduloAlgorithm(int a, int b) {
        int modulo = 1;
        int result = 0;
        while(modulo != 0) {
            result = b;
            modulo = a % b;
            a = b;
            b = modulo;


        }
        return result;
    }
}
