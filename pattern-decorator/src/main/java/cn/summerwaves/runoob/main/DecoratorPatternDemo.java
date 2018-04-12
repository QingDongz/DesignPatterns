package cn.summerwaves.runoob.main;

import cn.summerwaves.runoob.decorator.RedShapeDecorator;
import cn.summerwaves.runoob.decorator.YellowShapeDecorator;
import cn.summerwaves.runoob.reality.Circle;
import cn.summerwaves.runoob.reality.Rectangle;
import cn.summerwaves.runoob.reality.Shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        Shape doubleRedCircle = new RedShapeDecorator(redCircle);

        Shape addYellowCircle = new YellowShapeDecorator(doubleRedCircle);

        System.out.println("==============普通的圆形==============");
        circle.draw();
        System.out.println("==============红色的圆形==============");
        redCircle.draw();
        System.out.println("==============红色的三角形==============");
        redRectangle.draw();
        System.out.println("==============两层装饰==============");
        doubleRedCircle.draw();
        System.out.println("==============装饰一层黄色==============");
        addYellowCircle.draw();
    }
}
