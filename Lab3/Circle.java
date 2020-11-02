public class Circle extends Shape{
    protected double radius;

    public Circle(){
        radius = 0;
        color = "white";
        filled = false;
    }
    public Circle(double radius){
        this.radius = radius;
        color = "white";
        filled = false;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString(){
        return "Shape: circle, radius: " + radius + ", color: " + color;
    }
}
