package Assignment0;

public class Square extends Shape{
    double length;
    double height;

    public Square(String Square) {
        super(Square);
    }

    public void setDimensions(double length, double height){
        this.length = length;
        this.height = height;
    }

    @Override 
    public void printDimensions(){
        System.out.println("Length: " + length);
        System.out.println("Height: " + height);
    }

    @Override
    public double getArea() {
        return length*height;
    }
}
