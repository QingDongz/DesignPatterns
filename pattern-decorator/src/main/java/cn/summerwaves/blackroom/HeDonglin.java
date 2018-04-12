package cn.summerwaves.blackroom;

public class HeDonglin implements RoomMan {
    private Double weight;

    public HeDonglin(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public Double weight() {
        return this.weight;
    }
}
