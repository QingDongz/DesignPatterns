package cn.summerwaves.blackroom;

public abstract class RoomManWeightDecorator implements RoomMan {
    private Double weight;

    protected RoomMan roomMan;

    public RoomManWeightDecorator(RoomMan roomMan) {
        this.roomMan = roomMan;
    }

    @Override
    public Double weight() {
        return this.weight + roomMan.weight();
    }
}
