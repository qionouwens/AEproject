package Calc;

public class Tan implements Expression {
    private Expression contents;

    public Tan(Expression contents) {
        this.contents = contents;
    }

    public Tan(int degrees) {
        this(new Int(degrees));
    }

    public double evaluateNumerically() {
        return Math.tan(contents.evaluateNumerically());
    }
}
