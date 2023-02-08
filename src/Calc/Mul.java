package Calc;

import java.util.ArrayList;
import java.util.List;

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
}
