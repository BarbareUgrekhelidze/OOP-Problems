package v3;

public class AddNode extends Operation{
    public AddNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    protected char symbol(){
        return '+';
    }
}
