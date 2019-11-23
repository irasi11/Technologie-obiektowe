package prototype;

public class Circle implements Shape {

    private String color;

    public Circle(String color){
        this.color = color;
    }

    public Shape makeCopy() {
        Circle circleObj = null;
        try {
            circleObj = (Circle)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return circleObj;
    }

    public String getColor() {
        return color;
    }
}
