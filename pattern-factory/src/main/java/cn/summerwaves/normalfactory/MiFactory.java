package cn.summerwaves.normalfactory;

public class MiFactory extends AbstractPhoneFactory {
    public MiFactory(String shell, String camera, String cpu, String other) {
        super(shell, camera, cpu, other);
    }

    @Override
    public Mi createPhone() {
        assemblePhone();
        Mi mi = new Mi();
        mi.show();
        return mi;
    }
}
