package com.jqc.mytijcode.chapter1;

class Shape{
    void erase(){
        System.out.println("shape erase");
    }
    void draw(){
        System.out.println("shape draw");
    }

}
class Circe extends Shape{
    void erase(){
        System.out.println("circe erase");
    }
    void draw(){
        System.out.println("circe draw");
    }

}
class Triangle extends Shape{
    void erase(){
        System.out.println("triangle erase");
    }
    void draw(){
        System.out.println("triangle draw");
    }
}
class Line extends Shape{
    void erase(){
        System.out.println("line erase");
    }
    void draw(){
        System.out.println("line draw");
    }
}

public class T001_SimpleProxyDemo{
    public static void main(String[] args) {
        Shape shape = new Line();
        doSomthing(shape);

        shape = new Triangle();
        doSomthing(shape);

        shape = new Circe();
        doSomthing(shape);
    }

    static void doSomthing(Shape shape){
        shape.erase();
        shape.draw();
    }
}

