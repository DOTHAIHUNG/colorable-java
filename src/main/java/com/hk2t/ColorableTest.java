package com.hk2t;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("black", false, 25.9);
        shapes[1] = new Rectangle("green", true, 9.25, 25.9);
        shapes[2] = new Square("blue", true, 16.11);

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                Colorable colorable = (Square) shape;
                colorable.howToColor();
            } else System.out.println(shape + "Not is square, so can not be use how to color");
        }
    }
}
