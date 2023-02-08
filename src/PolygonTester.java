public class PolygonTester {
    public static void main(String[] args) {
        System.out.println("\nThis is the output with 5 sides, side length of 6.865, and a name of pentagon");
        Polygon poly1 = new Polygon(5, 6.865, "pentagon");
        System.out.println(poly1.getNumSides() == 5);
        System.out.println(poly1.getSideLength() == 6.865);
        System.out.println(poly1.getShapeType().equals("pentagon"));

        System.out.println("\nThis is the output using the default constructor.");
        Polygon poly2 = new Polygon();
        System.out.println(poly2.getNumSides() == 3);
        System.out.println(poly2.getSideLength() == 1.0);
        System.out.println(poly2.getShapeType().equals("triangle"));

        System.out.println("\nThis is an example output for an invalid polygon.");
        Polygon poly3 = new Polygon(1, 785, "line");
        System.out.println(poly3.getNumSides() == 3);
        System.out.println(poly3.getSideLength() == 1.0);
        System.out.println(poly3.getShapeType().equals("triangle"));
    }
}