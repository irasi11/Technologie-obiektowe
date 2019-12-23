public class RectanglePerimeter implements Strategy {
    @Override
    public double execute(double a, double b) {
        return 2*a + 2*b;
    }
}
