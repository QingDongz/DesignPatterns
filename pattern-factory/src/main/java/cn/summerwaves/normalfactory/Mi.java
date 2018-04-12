package cn.summerwaves.normalfactory;

public class Mi implements Phone {
    public void call() {
        System.out.println("我能打电话");
    }

    public void sendEmail() {
        System.out.println("我能发email");
    }

    public void sendNote() {
        System.out.println("我能发短信");
    }

    public void show() {
        call();
        sendEmail();
        sendNote();
        System.out.println("我性价比高");
    }
}
