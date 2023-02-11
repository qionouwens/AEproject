package Statics;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private List<Vector2D> vectorList;

    public Node() {
        vectorList = new ArrayList<>();
    }

    public void addVector(Vector2D vector) {
        vectorList.add(vector);
    }

    public Vector2D getResultant() {
        Vector2D vector = new Vector2D(0 ,0);
        for (Vector2D v : vectorList) {
            vector = vector.add(v);
        }
        return vector;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Node(");
        for (Vector2D v : vectorList) {
            stringBuilder.append(v.toString());
            stringBuilder.append(", ");
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
