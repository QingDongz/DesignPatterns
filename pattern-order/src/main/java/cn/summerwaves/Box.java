package cn.summerwaves;

public class Box {
    private Command startingUpCommand;


    public void setStartingUpCommand(Command startingUpCommand) {
        this.startingUpCommand = startingUpCommand;
    }

    public void startingUpButtonPress() {
        startingUpCommand.execute();
    }


}
