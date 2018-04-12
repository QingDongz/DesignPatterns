package cn.summerwaves.blackroom;

public class HeDonglinWeightDecorator extends RoomManWeightDecorator {

    private Double weight = 160.0;

    public HeDonglinWeightDecorator(RoomMan roomMan) {
        super(roomMan);
    }


    @Override
    public Double weight() {
        return this.weight + roomMan.weight();
    }




}
