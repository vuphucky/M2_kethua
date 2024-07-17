import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,4);
        Poin3D poin3D = new Poin3D(2,4, 7);

        float [] arr2D = point2D.getArrXY();
        float [] arr3D = poin3D.getArrXYZ();

        System.out.println(Arrays.toString(arr2D));
        System.out.println(Arrays.toString(arr3D));

        System.out.println(point2D);
        System.out.println(poin3D);
    }
}