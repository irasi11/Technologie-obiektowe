import java.sql.SQLOutput;

public class Triangle implements Shape {
    private String color;

    public void fillShape(String color) {
        this.color = color;
        System.out.println("Triangle filled with color " + color);
    }

    public String getColor(){
        return color;
    }
}
