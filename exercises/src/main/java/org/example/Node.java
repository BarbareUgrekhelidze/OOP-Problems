package org.example;

public class Node {

    // TODO private fields
    private Double value;
    private Character operator;
    private Node left;
    private Node right;

    public Node(double value) {
        this.value = value;
        this.operator = '$';
    }

    public Node(char operator, Node left, Node right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public Node(char operator, double left, double right) {
        this.operator = operator;
        this.left = new Node(left);
        this.right = new Node(right);
    }

    public double evaluate() {
        switch (this.operator){
            case '+':
                return left.evaluate() + right.evaluate();
            case '-':
                return left.evaluate() - right.evaluate();
            case '*':
                return left.evaluate() * right.evaluate();
            case '/':
                if (right.evaluate() == 0){
                    throw new IllegalArgumentException();
                }
                return left.evaluate() / right.evaluate();
            case '$':
                return value;
            default:
                throw new IllegalArgumentException();
        }

    }

    @Override
    public String toString() {
        switch (this.operator){
            case '+':
                return "(" + left.toString() + "+" + right.toString() + ")";
            case '-':
                return "(" + left.toString() + "-" + right.toString() + ")";
            case '*':
                return "(" + left.toString() + "*" + right.toString() + ")";
            case '/':
                if (right.toString().equals("0")){
                    throw new IllegalArgumentException();
                }
                return "(" + left.toString() +  "/" + right.toString() + ")";
            case '$':
                return value.toString();
            default:
                throw new IllegalArgumentException();
        }

    }

}