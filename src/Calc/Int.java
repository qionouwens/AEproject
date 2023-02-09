package Calc;

import java.util.Objects;

public class Int implements Expression {
    private int contents;

    public Int(int contents) {
        this.contents = contents;
    }

    public int getContents() {
        return contents;
    }

    @Override
    public double evaluateNumerically() {
        return (double) contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Int anInt = (Int) o;
        return contents == anInt.contents;
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents);
    }

    @Override
    public String toString() {
        return Integer.toString(contents);
    }
}
