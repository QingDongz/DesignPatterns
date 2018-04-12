package cn.summerwaves.runoob.decorator;

import cn.summerwaves.runoob.reality.Shape;

public class YellowShapeDecorator extends ShapeDecorator {

    public YellowShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setDecorator();
    }

    private void setDecorator() {
        System.out.println("give you a yellow picture");
    }

}
