public class Square extends Rectangle{
    public Square(){
        color = "white";
        filled = false;
        width = 1;
        length = 1;
    }
    public Square(double side){
        color = "white";
        filled = false;
        width = side;
        length = side;
    }
    public Square(double side, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        width = side;
        length = side;
    }

    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }
    @Override
    public  void setWidth(double width){
        this.width = width;
        length = width;
    }
    @Override
    public void setLength(double length){
        this.length = length;
        width = length;
    }
    @Override
    public String toString(){
        return "Shape: square, side: " + width + ", color: " + color;
    }
}
