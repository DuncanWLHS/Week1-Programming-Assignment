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
        shapeType = "triangle";
    }

    //Overloaded Polygon
    public Polygon(int numSides, double sideLength, String shapeType) {
        this.numSides = numSides;
        this.sideLength = sideLength;
        this.shapeType = shapeType;

    }

    //Accessors and Mutators
    public int getNumSides() {
        return numSides;
    }
    public void setSideLength(double sideLength){
        if (sideLength >= 0) {
            this.sideLength = sideLength;
        }else{
            this.sideLength = 0.0;
        }
    }
    public double getSideLength() {
        return sideLength;
    }
    public void setShapeType(String shapeType) {

        if (numSides < 0) {
            this.shapeType = "Invalid Number of Sides";
        }
        else if (numSides == 3) {
            this.shapeType = "triangle";
        }
        else if (numSides == 4) {
            this.shapeType = "Square";
        }
        else if (numSides == 5) {
            this.shapeType = "Pentagon";
        }
        else if (numSides == 6) {
            this.shapeType = "Hexagon";
        }
        else if (numSides == 7) {
            this.shapeType = "Heptagon";
        }
        else if (numSides == 8) {
            this.shapeType = "Octagon";
        }
        else if (numSides == 9) {
            this.shapeType = "Nonagon";
        }
        else if (numSides == 10) {
            this.shapeType = "Decagon";
        }else{
            this.shapeType = "Out of Scope";
        }
    }
    public String getShapeType(){
        return shapeType;
    }
    public String toString() {
        if (this.numSides < 3 || this.sideLength < 0) {
         return "This is an invalid Polygon!";
        } else {
            return "Your shape is a " + shapeType + " and it has " + numSides + " sides.\n" +
                    "It has a side length of " + sideLength + "\n" +
                    "It has a perimeter of 34.325 units.\n";
        }
    }

}