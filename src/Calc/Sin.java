package Calc;

import java.util.Objects;

public class Sin implements Expression {
    private Expression contents;

    public Sin(Expression contents) {
        this.contents = contents;
    }

    public Sin(int degrees) {
        contents = new Int(degrees);
    }

    public double evaluateNumerically() {
        return Math.sin(Math.toRadians(contents.evaluateNumerically()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sin sin = (Sin) o;
        return contents.equals(sin.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents);
    }

    @Override
    public String toString() {
        return "Sin(" + contents.toString() +
                ')';
    }
}
