package command;

class CommandControl {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void pressRemote(){
        command.execute ();
    }
}
