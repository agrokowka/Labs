public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        width = 1;
        length = 2;
        color = "white";
        filled = false;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        color = "white";
        filled = false;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * (width + length);
    }
    @Override
    public String toString(){
        return "Shape: rectangle, width: " + width + ", length: " + length + ", color: " + color;
    }
}
