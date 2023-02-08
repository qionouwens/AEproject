package Calc;

import java.util.ArrayList;
import java.util.List;

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
}
