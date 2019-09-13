package command;

public class Ac {
    private int temperature;
    void increaseTemperature(){
        temperature+=1;
        show ();
    }
    void decreaseTemperature(){
        temperature-=1;
        show ();
    }

    private void show(){
        System.out.println ("AC Temperature now is "+temperature);
    }
}
