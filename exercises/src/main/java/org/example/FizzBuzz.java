package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzz {
    public String evaluate(int n){
        if (n % 15 == 0 || containsDigit(n, 3) && containsDigit(n, 5)){
            return "FizzBuzz";
        }else if (n % 3 == 0 || containsDigit(n, 3)){
            return "Fizz";
        }else if (n % 5 == 0 || containsDigit(n, 5)){
            return "Buzz";
        }else{
            return String.valueOf(n);
        }

    }

    private boolean containsDigit(int n, int digit) {
        return String.valueOf(n).contains(String.valueOf(digit));
    }


}
