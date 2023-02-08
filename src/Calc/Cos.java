package Calc;

public class Cos implements Expression {
    private Expression contents;

    public Cos(Expression contents) {
        this.contents = contents;
    }

    public Cos(int degrees) {
        contents = new Int(degrees);
    }

    public double evaluateNumerically() {
        return Math.cos(contents.evaluateNumerically());
    }
}
