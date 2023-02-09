package Calc;

import java.util.Objects;

public class Cos implements Expression {
    private Expression contents;

    public Cos(Expression contents) {
        this.contents = contents;
    }

    public Cos(int degrees) {
        contents = new Int(degrees);
    }

    public Expression getContents() {
        return contents;
    }

    public double evaluateNumerically() {
        return Math.cos(Math.toRadians(contents.evaluateNumerically()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cos cos = (Cos) o;
        return contents.equals(cos.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents);
    }

    @Override
    public String toString() {
        return "Cos(" + contents.toString() + ')';
    }
}
