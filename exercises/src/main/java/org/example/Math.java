package org.example;

public class Math {
    public static int add(int n1, int n2){
        return n1+n2;
    }

    public static int abs(int n){
        if (n == Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        return n < 0 ? -n : n;
    }
}
