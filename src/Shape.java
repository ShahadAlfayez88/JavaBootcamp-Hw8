public class Shape {

    private String Color;

    private boolean Filled;

    public Shape(){
        Color = "Green";
        Filled = true;
    }
    public Shape(String Color,Boolean Filled){
        this.Color=Color;
        this.Filled=Filled;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isFilled() {
        return Filled;
    }

    public void setFilled(boolean filled) {
        Filled = filled;
    }

    @Override
    public String toString() {
        String isFillied = " ";

        if (Filled==true)
            isFillied = "is Filled";
        else
            isFillied = "not Filled";

        return "A Shape with " +
                "Color of '" + Color + '\'' +
                "and shape " + isFillied
                ; }
    }

