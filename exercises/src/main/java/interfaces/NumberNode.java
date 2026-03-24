package interfaces;

public class NumberNode implements Node{
    private double value;

    private NumberNode (double value){
        this.value = value;
    }

    @Override
    public double evaluate() {
        return this.value;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
