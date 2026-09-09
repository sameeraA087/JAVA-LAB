class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a Rectangle");
    }
}

public class HierarchicalDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.drawCircle();

        r.display();
        r.drawRectangle();
    }
}
