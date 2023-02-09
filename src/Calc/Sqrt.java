package Calc;

import java.util.Objects;

public class Sqrt implements Expression {
    private Expression contents;

    public Sqrt(Expression contents) {
        this.contents = contents;
    }

    @Override
    public double evaluateNumerically() {
        return Math.sqrt(contents.evaluateNumerically());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sqrt sqrt = (Sqrt) o;
        return contents.equals(sqrt.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents);
    }

    @Override
    public String toString() {
        return "Sqrt(" + contents +
                ')';
    }
}
