package cn.summerwaves;

public class PressStartingUpButton {
    public static void main(String[] args) {
        AsusMainBoard asusMainBoard = new AsusMainBoard();
        AsusStartingUpCommand asusStartingUpCommand = new AsusStartingUpCommand();
        Box box = new Box();

        asusStartingUpCommand.setMainBoard(asusMainBoard);
        box.setStartingUpCommand(asusStartingUpCommand);

        box.startingUpButtonPress();
    }
}
