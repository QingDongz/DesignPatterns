package cn.summerwaves.normalfactory;

public class MeizuFactory extends AbstractPhoneFactory {

    public MeizuFactory(String shell, String camera, String cpu, String other) {
        super(shell, camera, cpu, other);
    }

    @Override
    public Meizu createPhone() {
        assemblePhone();
        Meizu meizu = new Meizu();
        meizu.show();
        return meizu;
    }
}
