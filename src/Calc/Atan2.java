package Calc;

import java.util.Objects;

public class Atan2 implements Expression {
    private Expression contents1;
    private Expression contents2;

    public Atan2(Expression contents1, Expression contents2) {
        this.contents1 = contents1;
        this.contents2 = contents2;
    }

    public double evaluateNumerically() {
        return Math.toDegrees(Math.atan2(contents1.evaluateNumerically(), contents2.evaluateNumerically()));
    }

    @Override
    public String toString() {
        return "Atan2(" + contents1.toString() +
                "," + contents2.toString() +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atan2 atan2 = (Atan2) o;
        return contents1.equals(atan2.contents1) && contents2.equals(atan2.contents2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents1, contents2);
    }
}
