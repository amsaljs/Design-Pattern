package strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println (new Context (new Subtraction ()).execute (20,10));
    }
}
