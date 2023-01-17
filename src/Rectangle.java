public class Rectangle extends Shape{
    private double Width ;
    private double length ;

    public Rectangle() {
        Width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.Width = width;
        this.length = length;
    }

    public Rectangle(String Color, Boolean Filled, double width, double length) {
        super(Color, Filled);
        this.Width = width;
        this.length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return Width*length;
    }
    public double getPerimeter(){
        double  perimeter = 2 * (length + Width);
        return perimeter;
    }

    @Override
    public String toString() {
        return "A Rectangle with" +
                " Width = " + Width +
                " and length = " + length +
                " Which is a subclass of "+super.toString() ;
    }
}
