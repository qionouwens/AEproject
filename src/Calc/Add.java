package Calc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Add implements Expression {
    private List<Expression> contents;

    public Add() {
        contents = new ArrayList<>();
    }

    public Add(Expression first, Expression second) {
        contents = new ArrayList<>();
        contents.add(first);
        contents.add(second);
    }

    public double evaluateNumerically() {
        double total = 0;
        for (Expression expr : contents) {
            total += expr.evaluateNumerically();
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Add add = (Add) o;
        return contents.equals(add.contents);
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
            finalString.append("+");
        }
        finalString.deleteCharAt(finalString.length()-1);
        finalString.append(")");
        return finalString.toString();
    }
}
