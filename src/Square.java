public class Square extends Rectangle{


    public Square(){}
    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String Color, Boolean Filled, double width, double length) {
        super(Color, Filled, width, length);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double width){
         super.setWidth(width*width);
    }

    @Override
    public String toString() {
        return "A Square with side = "+getSide()+
                " Which is a subclass of "+super.toString();
    }
}
