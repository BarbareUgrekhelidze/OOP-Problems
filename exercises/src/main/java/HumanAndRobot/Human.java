package HumanAndRobot;

public class Human implements Work, Eat{
    @Override
    public void eat() {
        System.out.println("Human eat");
    }

    @Override
    public void work() {
        System.out.println("Human work");
    }
}
