package Calc;

import java.util.Objects;

public class Divide implements Expression {
    private Expression denominator;
    private Expression numerator;

    public Divide(Expression denominator, Expression numerator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    @Override
    public double evaluateNumerically() {
        return denominator.evaluateNumerically() / numerator.evaluateNumerically();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Divide divide = (Divide) o;
        return denominator.equals(divide.denominator) && numerator.equals(divide.numerator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominator, numerator);
    }

    @Override
    public String toString() {
        return "Divide(" + denominator.toString() +
                " / " + numerator.toString() +
                ')';
    }
}
