package Assignment0;

public class Circle extends Shape {
    double radius;

    public Circle(String Circle) {
        super(Circle);
    }

    public void setDimensions(double radius){
        this.radius = radius;
    }

    @Override 
    public void printDimensions(){
        System.out.println("Radius: " + radius);
    }

    @Override
    public double getArea() {
        return Math.PI*(radius*radius);
    }
}
