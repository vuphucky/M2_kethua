// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Circle circle = new Circle(2.3, "red");
        System.out.println(circle);
        circle.setRadius(5.2);
        circle.setColor("black");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(5.4, 3.6, "brown");
        System.out.println(cylinder);
        cylinder.setRadius(4.5);
        cylinder.setHeight(6.3);
        cylinder.setColor("yellow");
        System.out.println(cylinder);
    }
}