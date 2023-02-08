package Calc;

public class Sqrt implements Expression {
    private Expression contents;

    public Sqrt(Expression contents) {
        this.contents = contents;
    }

    @Override
    public double evaluateNumerically() {
        return Math.sqrt(contents.evaluateNumerically());
    }
}
