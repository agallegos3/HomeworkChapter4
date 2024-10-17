package Exercise3;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean checkSides() throws IllegalTriangleSideException {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            return true;
        }
        throw new IllegalTriangleSideException("Sides are incorrect");
    }
}



