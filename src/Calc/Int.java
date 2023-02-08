package Calc;

public class Int implements Expression {
    private int contents;

    public Int(int contents) {
        this.contents = contents;
    }

    public int getContents() {
        return contents;
    }

    @Override
    public double evaluateNumerically() {
        return (double) contents;
    }
}
