package command;

public class Main {
    public static void main(String[] args) {
        Ac ac = new Ac ();
        CommandControl commandControl = new CommandControl ();
        Command increase = new IncreaseTemperature (ac);
        Command reduce = new ReduceTemperature (ac);

        commandControl.setCommand (increase);
        commandControl.pressRemote ();
        commandControl.setCommand (increase);
        commandControl.pressRemote ();

        commandControl.setCommand (reduce);
        commandControl.pressRemote ();

    }
}
