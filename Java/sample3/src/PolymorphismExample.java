abstract class Shape {
    abstract void draw();
}

class Polyline extends Shape {
//    折れ線を描画
    void draw() {
        System.out.println("N");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("□");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("◯");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Polyline();
        shape[1] = new Rectangle();
        shape[2] = new Circle();

        for(int i=0; i<3; i++) {
            shape[i].draw();
        }
    }
}
