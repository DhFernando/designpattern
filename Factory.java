interface Shape {
    void Drow();
}

class Rectangle implements Shape {

    @Override
    public void Drow() {
        System.out.println("Rectangle");
    }
}

class Square implements Shape {

    @Override
    public void Drow() {
        System.out.println("Square");
    }
}

class Circle implements Shape {

    @Override
    public void Drow() {
        System.out.println("Circle");
    }
}

class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

public class Factory {
    public static void main(String args[]) {
        ShapeFactory sf = new ShapeFactory();
        sf.getShape("RECTANGLE").Drow();
    }
}

/*
 * 
 * new ShapeFactory("CIRCLE");
 * 
 */
