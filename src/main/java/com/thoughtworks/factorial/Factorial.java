package com.thoughtworks.factorial;

public class Factorial {
    public Integer compute(int i) {
        int fact = 1;

        if(i < 0) throw new IllegalArgumentException();
        if(i == 0) return 1;
        for(int j = i; j > 0; j--){
            fact *= j;
        }
        return fact;
    }
}
