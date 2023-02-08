package Calc;

public class Sin implements Expression {
    private Expression contents;

    public Sin(Expression contents) {
        this.contents = contents;
    }

    public Sin(int degrees) {
        contents = new Int(degrees);
    }

    public double evaluateNumerically() {
        return Math.sin(contents.evaluateNumerically());
    }
}
