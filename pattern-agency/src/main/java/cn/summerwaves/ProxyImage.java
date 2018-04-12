package cn.summerwaves;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("在被代理类方法前进行操作");
        if (null == realImage) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
        System.out.println("在被代理类方法后进行操作");

    }
}
