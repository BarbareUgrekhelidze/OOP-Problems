package interfaces;

public class Mobile extends Phone{

    @Override
    void makeCall(String number) {
        System.out.println("Make call " + number);
    }

    @Override
    void Plugin(){

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
}
