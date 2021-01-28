package Assignment0;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    private double perimeter;

    public Triangle(String Triangle) {
        super(Triangle);
    }

    public void setDimensions(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = a+b+c;
    }

    @Override 
    public void printDimensions(){
        System.out.println("Side 1: " + a);
        System.out.println("Side 2: " + b);
        System.out.println("Side 3: " + c);
    }

    @Override
    public double getArea(){
        double s = perimeter*(.5);
        return Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
    }
}
