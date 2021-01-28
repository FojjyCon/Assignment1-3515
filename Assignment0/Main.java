package Assignment0;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner 
        Scanner input = new Scanner(System.in);

        // instances
        Square square = new Square("square");
        Circle circle = new Circle("circle");
        Triangle triangle = new Triangle("triangle");
        EquillateralTriangle eqTriangle = new EquillateralTriangle("eqTriangle");

        // square inputs
        System.out.println("\n--SQUARE--");
        System.out.println("Enter a length: ");
        double length = input.nextDouble();
        System.out.println("Enter a height: ");
        double height = input.nextDouble();
        square.setDimensions(length,height);

        // circle inputs
        System.out.println("\n--CIRCLE--");
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        circle.setDimensions(radius);
        
        // triangle inputs
        System.out.println("\n--TRIANGLE--");
        System.out.println("Enter a side 1 length: ");
        double a = input.nextDouble();
        System.out.println("Enter a side 2 length: ");
        double b = input.nextDouble();
        System.out.println("Enter a side 3 length: ");
        double c = input.nextDouble();
        triangle.setDimensions(a,b,c);

        // equillateral traingle inputs
        System.out.println("\n--EQUILLATERAL TRIANGLE--");
        System.out.println("Enter a side length: ");
        double side = input.nextDouble();
        eqTriangle.setDimensions(side);

        System.out.println("\n------------------------------------------------------");
        System.out.println(square.getName() + " area: " + square.getArea());
        square.printDimensions();
        
        System.out.println("\n" + circle.getName() + " area: " + circle.getArea());
        circle.printDimensions();
        
        System.out.println("\n" + triangle.getName() + " area: " + triangle.getArea());
        triangle.printDimensions();
        
        System.out.println("\n" + eqTriangle.getName() + " area: " + eqTriangle.getArea());
        eqTriangle.printDimensions();

        input.close();
    }
}
