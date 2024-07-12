public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);


        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);
        System.out.println("dien tich = " + circle.getArea());
        System.out.println("chu vi = " + circle.getPerimeter());

        circle = new Circle(5.5,"indigo", false);
        System.out.println(circle);
        System.out.println("dien tich = " + circle.getArea());
        System.out.println("chu vi = " + circle.getPerimeter());


        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(5.0,6.5);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);


        Square square = new Square();
        System.out.println(square);

        square = new Square(5);
        System.out.println(square);

        square = new Square(5.8,"yellow", true);
        System.out.println(square);
    }
}
