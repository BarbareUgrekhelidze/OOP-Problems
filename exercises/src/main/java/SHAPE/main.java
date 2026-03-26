package SHAPE;

public class main {
    public static void main(String[] args){
        Shape rect = new Rectangle(10, 15);
        Shape square = new Square(12);

        System.out.println(rect.getArea());
        System.out.println(square.getArea());
    }
}
