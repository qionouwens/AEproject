package Calc;

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
}
