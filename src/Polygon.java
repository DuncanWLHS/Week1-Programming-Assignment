public class Polygon {

    //Instance Variables
    private int numSides;
    private double sideLength;
    private double polygonArea;
    private double polygonPerimeter;
    private String shapeType;


    //Default Polygon
    public Polygon() {
        numSides = 3;
        sideLength = 1.0;
        polygonPerimeter = 3.0;
    }

    //Overloaded Polygon
    public Polygon(double numSides, double sideLength, String shapeType) {
        this.numSides = numSides;
        this.sideLength = sideLength;

    }

}