public class Flower {
    private int x;
    private int y;
    private FlowerType type;

    public Flower(int x, int y, FlowerType type){
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public FlowerType getTreeName(){
        return type;
    }
}
