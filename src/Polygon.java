import java.lang.Math;
/**
 *
 * @Date 02/04/2023
 * @author Duncan Duffield
 * @Description This is a class that creates a Polygon Object that can have modular sides, side lengths, and shape types.
 * @file Polygon.java
 *
 */

public class Polygon {

    //Instance Variables
    private int numSides;

    private double sideLength;

    private double polygonPerimeter;

    private String shapeType;

    //Default Polygon

    /**
     * @Description This is th default Polygon Object which returns a Polygon with 3 sides, a side length of 1,
     * a perimeter of 3, and the name "triangle".
     */

    public Polygon() {
        numSides = 3;
        sideLength = 1.0;
        shapeType = "Triangle";
    }

    //Overloaded Polygon

    /**
     * @param numSides   This dictates the number of sides the Polygon Object has.
     * @param sideLength This dictates the side length the Polygon Object has.
     * @param shapeType  This dictates the name of the Polygon that is created.
     * @Description This is another Polygon Object that has parameter that can be defined by the user.
     */

    public Polygon(int numSides, double sideLength, String shapeType) {
        this.numSides = numSides;
        this.sideLength = sideLength;
        this.shapeType = shapeType;
    }

    //Accessors and Mutators

    /**
     * @param newNumSides set numSides to a new value;
     */
    public void setNumSides(int newNumSides) {
        numSides = newNumSides;
    }

    /**
     * @param newSideLength sets sideLength to a new value
     */
    public void setSideLength(double newSideLength) {
        sideLength = newSideLength;
    }

    /**
     * @param newShapeType changes to name of the polygon.
     */
    public void setShapeType(String newShapeType) {
        shapeType = newShapeType;
    }

    /**
     * @return The number of sides a polygon has.
     */

    public int getNumSides() {
        return numSides;
    }

    /**
     * @return The side length of the polygon.
     */

    public double getSideLength() {
        return sideLength;
    }

    /**
     * @return the name of the polygon.
     */

    public String getShapeType() {
        return shapeType;
    }

    /**
     * @return the perimeter of the polygon.
     */

    public double getPolygonPerimeter() {
        return polygonPerimeter;
    }

    //Other Methods

    /**
     * @return the calculated perimeter of the polygon.
     */

    public double calculatePerimeter() {
        double perimeter = numSides * sideLength;
        double roundedPerimeter = (Math.round(perimeter * 1000) / 1000.0);
        return roundedPerimeter;
    }

    /**
     * @return a print statement with all the information about the polygon, if there is an invalid attribute of the polygon then,
     * the method would return an invalid statement.
     */

    public String toString() {

        if (this.numSides < 3 || this.sideLength < 0) {
            setShapeType("Triangle");
            setNumSides(3);
            setSideLength(1.0);
            return "This is a invalid polygon, setting values to the default polygon.";
        } else {
            return "Your shape is a " + shapeType + " and it has " + numSides + " sides.\n" +
                    "It has a side length of " + sideLength + "\n" +
                    "It has a perimeter of " + calculatePerimeter() + " units.\n";
        }
    }
}