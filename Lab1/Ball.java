package Lab1;

public class Ball {
    private String type;
    private int size;
    private String color;

    public Ball(String t, int s, String c){
        type = t;
        size = s;
        color = c;
    }
    public Ball(String t){
        type = t;
        size = 5;
        color = "white";
    }
    public Ball(int s, String c){
        type = "football";
        size = s;
        color = c;
    }
    public Ball(){
        type = "football";
        size = 5;
        color = "white";
    }

    public void setType(String type){
        this.type = type;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return "It is a " + this.type + " ball, " + size + " size, " + color + " color.";
    }
}
