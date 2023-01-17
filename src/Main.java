public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Square s2 = new Square();

        System.out.println("Test Program to test all shape function"+"\n"+"get Color : "+s1.getColor()+"\nis Filled "+s1.isFilled());



        System.out.println("------------------");
        System.out.println("Method Get Area - Circle");
        c1.setRadius(5.0);
        System.out.println("the result is : "+ c1.getArea()+"\n");
        System.out.println("Method Get Area - Rectangle");
        r1.setLength(10);
        r1.setWidth(20);
        System.out.println("the result is : "+ r1.getArea()+"\n");
        System.out.println("Method Get Side - Square");
        s2.setSide(5);
        System.out.println("the result is : "+ s2.getSide()+"\n");
        System.out.println("Method Get Perimeter - Rectangle");
        System.out.println("the result is : "+ r1.getPerimeter()+"\n");
        System.out.println("Method Get Perimeter - Circle");
        System.out.println("the result is : "+ c1.getPerimeter()+"\n");

        System.out.println("------------------");
        System.out.println("toString functions ");
        System.out.println(s1.toString());
        System.out.println(c1.toString());
        System.out.println(r1.toString());
        System.out.println(s2.toString());

    }
}