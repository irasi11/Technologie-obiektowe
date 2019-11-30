public class Circle implements Shape {
    private String color;

    public void fillShape(String color) {
        this.color = color;
        System.out.println("Circle filled with color " + color);
    }

    public String getColor(){
        return color;
    }

}
