package Calc;

import java.util.Objects;

public class Tan implements Expression {
    private Expression contents;

    public Tan(Expression contents) {
        this.contents = contents;
    }

    public Tan(int degrees) {
        this(new Int(degrees));
    }

    public double evaluateNumerically() {
        return Math.tan(Math.toRadians(contents.evaluateNumerically()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tan tan = (Tan) o;
        return contents.equals(tan.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents);
    }

    @Override
    public String toString() {
        return "Tan(" + contents.toString() +
                '}';
    }
}
