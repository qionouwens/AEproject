package Calc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mul implements Expression {
    private List<Expression> contents;

    public Mul() {
        contents = new ArrayList<>();
    }

    public Mul(Expression first, Expression second) {
        contents = new ArrayList<>();
        contents.add(first);
        contents.add(second);
    }

    @Override
    public double evaluateNumerically() {
        double total = 1.0;
        for (Expression expr : contents) {
            total *= expr.evaluateNumerically();
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mul mul = (Mul) o;
        return contents.equals(mul.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents);
    }

    @Override
    public String toString() {
        StringBuilder finalString = new StringBuilder();
        finalString.append("(");
        for (Expression content : contents) {
            finalString.append(content.toString());
            finalString.append("*");
        }
        finalString.deleteCharAt(finalString.length()-1);
        finalString.append(")");
        return finalString.toString();
    }
}
