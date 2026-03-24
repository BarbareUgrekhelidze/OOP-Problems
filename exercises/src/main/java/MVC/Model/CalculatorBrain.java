package MVC.Model;

import MVC.View.DisplayListener;

public class CalculatorBrain {
    private DisplayListener displayListener;
    private String prevInput;
    private String currInput;
    private char operator;

    public CalculatorBrain(){
        prevInput = "0";
        currInput = "0";
        operator = '$';
    }

    public void addNumber(String number){
        currInput = number;

        if (operator == '$'){
            prevInput = currInput;
            fireDisplayChanged(number);
        }else{
            double result = calculate();
            currInput = "0";
            prevInput = "0";
            operator = '$';
            fireDisplayChanged(String.valueOf(result));
        }
    }

    private double calculate(){
        double num1 = Double.parseDouble(prevInput);
        double num2 = Double.parseDouble(currInput);
        switch (operator){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1/num2;
        }
        return 0;
    }

    public void addOperator(char operator){
        this.operator = operator;
        prevInput = currInput;
        fireDisplayChanged("" + operator);
    }

    public void registerDisplayListener(DisplayListener display){
        this.displayListener = display;
    }

    public void fireDisplayChanged(String newValue){
        displayListener.displayChanged(newValue);

    }
}
