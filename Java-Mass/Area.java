import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Area of square
        float side = scan.nextFloat();
        float areaOfSquare = square(side);
        System.out.println("Area of square with side " + side + " is " + areaOfSquare);

        // Area of Rectangle
        float length = scan.nextFloat();
        float breadth = scan.nextFloat();
        float areaOfRectangle = rectangle(length, breadth);
        System.out.println(
                "Area of rectangle with length " + length + " and breadth " + breadth + " is " + areaOfRectangle);

        // Area of Triangle
        float b = scan.nextFloat();
        float h = scan.nextFloat();
        float areaOfTriangle = triangle(b, h);
        System.out.println("Area of Triangle with breadth " + b + " and height " + h + " is " + areaOfTriangle);

        // Area of Circle
        float radius = scan.nextFloat();
        float areaOfCircle = circle(radius);
        System.out.println("Area of circle with radius " + radius + " is " + areaOfCircle);

        // Area of Parallelogram
        float base = scan.nextFloat();
        float height = scan.nextFloat();
        float areaOfParallelogram = parallelogram(base, height);
        System.out.println("Area of Parallelogram with base " + base + " and height is " + areaOfParallelogram);

        // Area of Trapezium
        float aa = scan.nextFloat();
        float bb = scan.nextFloat();
        float hh = scan.nextFloat();
        float areaOfTrapezium = trapezium(aa, bb, hh);
        System.out.println(
                "Area of Trapezium with bases " + aa + ", " + bb + " and height " + hh + " is " + areaOfTrapezium);
    }

    static float square(float side) {
        return side * side;
    }

    static float rectangle(float length, float breadth) {
        return 2 * (length + breadth);
    }

    static float triangle(float breadth, float height) {
        return (breadth * height) / 2.0f;
    }

    static float circle(float r) {
        return (float) (3.21 * r * r);
    }

    static float parallelogram(float base, float height) {
        return base * height;
    }

    static float trapezium(float a, float b, float h) {
        return (1 / 2.0f) * (a + b) * h;
    }
}
