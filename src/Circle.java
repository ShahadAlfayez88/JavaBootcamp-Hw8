public class Circle extends Shape{
    private double Radius ;

    public Circle(){
        this.Radius = 1.0;
    }

    public Circle(double Radius){
        this.Radius=Radius;
    }

    public Circle(String Color, Boolean Filled, double radius) {
        super(Color, Filled);
        this.Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        this.Radius = radius;
    }

    public double getArea(){
    double Area = Math.PI * Radius * Radius;
        return Area;
    }
    public double getPerimeter(){
        double  perimeter = 2 * Math.PI * Radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "A Circle with " +
                "Radius = " + Radius +
                " Which is a subclass of "+super.toString()
                ;
    }
}
