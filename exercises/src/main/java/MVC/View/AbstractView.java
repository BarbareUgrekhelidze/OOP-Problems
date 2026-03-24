package MVC.View;

public abstract class AbstractView implements DisplayListener{
    private InputListener inputListener;

    public void registerInputListener(InputListener inputListener){
        this.inputListener = inputListener;
    }

    public void fireInputChanged(String input){
        this.inputListener = inputListener;
    }

    public abstract void show();
}
