package interfaces;

public class DivideNode implements Node{
    private final Node left;
    private final Node right;

    public DivideNode(Node left, Node right){
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }

    @Override
    public String toString(){
        if (right.evaluate() == 0){
            throw new IllegalArgumentException();
        }
        return "(" + left.toString() + "+" + right.toString() + ")";
    }
}
