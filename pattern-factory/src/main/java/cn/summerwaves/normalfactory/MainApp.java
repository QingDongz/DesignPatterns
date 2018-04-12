package cn.summerwaves.normalfactory;

public class MainApp {
    public static void main(String[] args) {
        MeizuFactory meizuFactory = new MeizuFactory("魅族手机外壳", "魅族摄像头", "魅族CPU", "其他零件");
        Meizu meizu = meizuFactory.createPhone();
        System.out.println();
        MiFactory miFactory = new MiFactory("小米手机外壳", "小米摄像头", "小米CPU", "其他零件");
        Mi mi = miFactory.createPhone();
    }
}
