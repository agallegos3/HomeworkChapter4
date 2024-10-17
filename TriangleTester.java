package Exercise3;

public class TriangleTester {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(1,2,2);
        Triangle triangle2 = new Triangle(5,5,4);
        Triangle triangle3 = new Triangle(9,9,8);
        try {
            System.out.println("Triangle is valid: " + triangle1.checkSides());
            System.out.println("Triangle is valid: " + triangle2.checkSides());
            System.out.println("Triangle is valid: " + triangle3.checkSides());
        } catch (IllegalTriangleSideException e) {
            e.printStackTrace();
        }
    }
}
