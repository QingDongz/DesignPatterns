package cn.summerwaves.simplefatory;

/**
 * 客户端（需要Api的类）
 */
public class Client {
    public static void main(String[] args) {
        Api apiA = Factory.createApi("A");
        apiA.operation();
        Api apiB = Factory.createApi("B");
        apiB.operation();
    }
}
