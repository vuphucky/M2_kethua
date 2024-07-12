public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape(){}

    public Shape(String color, boolean filled){
        this.filled = filled;
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void set(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of " + getColor() + " and "
                + (isFilled()? "filled" : "not filled");
    }
}
