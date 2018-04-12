package cn.summerwaves.normalfactory;

public abstract class AbstractPhoneFactory {
    public String shell;
    public String camera;
    public String cpu;
    public String other;

    public AbstractPhoneFactory(String shell, String camera, String cpu, String other) {
        this.shell = shell;
        this.camera = camera;
        this.cpu = cpu;
        this.other = other;
    }

    public void assemblePhone() {
        System.out.println("将零件组装为手机，它们分别是：" + shell + camera + cpu + other);
    }

    public abstract Phone createPhone();

}
