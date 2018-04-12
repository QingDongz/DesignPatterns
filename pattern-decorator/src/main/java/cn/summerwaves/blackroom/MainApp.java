package cn.summerwaves.blackroom;

public class MainApp {
    public static void main(String[] args) {
        HeDonglin heDonglin = new HeDonglin(100.0);
        HeDonglinWeightDecorator heDonglinWeightDecorator = new HeDonglinWeightDecorator(heDonglin);

        System.out.println(heDonglinWeightDecorator.weight());
    }
}
