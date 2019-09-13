package command;

public class ReduceTemperature implements Command {
    private Ac ac;
    ReduceTemperature(Ac ac) {
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.decreaseTemperature ();
    }
}
