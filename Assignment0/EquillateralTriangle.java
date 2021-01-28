package Assignment0;

public class EquillateralTriangle extends Shape{
    double oneSide;

    public EquillateralTriangle(String EquillateralTriangle) {
        super(EquillateralTriangle);
    }

    public void setDimensions(double oneSide){
        this.oneSide = oneSide;
    }

    @Override 
    public void printDimensions(){
        System.out.println("Side 1: " + oneSide);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3)/4)*(oneSide*oneSide);
    }
}
