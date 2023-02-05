/**
 * @Date 02/04/2023
 * @author Duncan Duffield
 * @Description This class generates polygon objects from the Polygon.java class.
 */

public class PolygonTester {
    public static void main(String[] args) {
        System.out.println("\nThis is the output with 4 sides, side length of 1, and a name of square.");
        Polygon poly = new Polygon(4,1,"square");
        System.out.println(poly);

        System.out.println("\nThis is the output with 10 sides, side length of 1.0, and a name of decagon.");
        Polygon poly1 = new Polygon(10,2,"decagon");
        System.out.println(poly1);

        System.out.println("\nThis is the output using the default constructor.");
        Polygon poly2 = new Polygon();
        System.out.println(poly2);

        System.out.println("\nThis is an example output for an invalid polygon.");
        Polygon poly3 = new Polygon(3,-3,"Bad Polygon");
        System.out.println(poly3);
    }
}