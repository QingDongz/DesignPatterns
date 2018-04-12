package cn.summerwaves;

public class AsusStartingUpCommand implements Command {
    private MainBoard mainBoard = null;

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public void execute() {
        this.mainBoard.startingUp();
    }
}
