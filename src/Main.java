import Statics.Node;
import Statics.Vector2D;

public class Main {
    public static void main(String[] args) {
        Node node = new Node();
        node.addVector(new Vector2D(2000, 45, true));
        node.addVector(new Vector2D(6000, 180-60, true));
        Vector2D resultant = node.getResultant();
        System.out.println(resultant.getMagnitude().evaluateNumerically());
        System.out.println(resultant.getAngle().evaluateNumerically());
    }
}
