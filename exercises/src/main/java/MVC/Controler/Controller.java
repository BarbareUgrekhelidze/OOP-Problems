package MVC.Controler;
import MVC.Model.CalculatorBrain;
import MVC.View.AbstractView;
import MVC.View.InputListener;

public class Controller implements InputListener {
    private AbstractView view;
    private CalculatorBrain brain;

    public Controller(AbstractView view, CalculatorBrain brain){
        this.view = view;
        this.brain = brain;

        this.view.registerInputListener(this);
        this.brain.registerDisplayListener(view);
    }

    @Override
    public void inputChanged(String input) {
        char c = input.charAt(0);
        if (Character.isDigit(c)){
            brain.addNumber(input);
        }else if("+-*/".indexOf(c) != -1){
            brain.addOperator(c);
        }else{
            throw new IllegalArgumentException("Invalid Argument");
        }
    }

    public void start(){
        view.show();
    }
}
