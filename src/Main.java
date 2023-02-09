import Statics.Vector2D;

public class Main {
    public static void main(String[] args) {
        Vector2D f1 = new Vector2D(100, 15, true);
        Vector2D f2 = new Vector2D(150, 90-10, true);
        Vector2D resultant = (Vector2D) f1.add(f2);
        System.out.println(resultant.getMagnitude().evaluateNumerically());
        System.out.println(resultant.getAngle().evaluateNumerically());
    }
}
