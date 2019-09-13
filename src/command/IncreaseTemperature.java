package command;

public class IncreaseTemperature implements Command {
    private Ac ac;
    IncreaseTemperature(Ac ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.increaseTemperature ();
    }
}
