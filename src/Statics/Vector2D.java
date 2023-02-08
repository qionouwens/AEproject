package Statics;

import Calc.*;
import Calc.Int;

public class Vector2D implements Vector {
    private Expression x;
    private Expression y;
    private Expression magnitude;
    private Expression angle;
    private Point origin;

    public Vector2D(Expression magnitude, Expression angle) {
        this(new Point(0, 0), magnitude, angle);
    }

    public Vector2D(int magnitude, int angle) {
        this(new Int(magnitude), new Int(angle));
    }

    public Vector2D(Point origin, Expression magnitude, Expression angle) {
        this.magnitude = magnitude;
        this.angle = angle;
        this.origin = origin;
        x = new Mul(magnitude, new Cos(angle));
        y = new Mul(magnitude, new Sin(angle));
    }

    public Vector2D(Point origin, int magnitude, int angle) {
        this(origin, new Int(magnitude), new Int(angle));
    }

    public Vector2D(Point origin, Int[] vector) {
        this.x = vector[0];
        this.y = vector[1];
        this.origin = origin;
        this.magnitude = new Sqrt(new Add(new Mul(x, x), new Mul(y, y)));
        throw new UnsupportedOperationException("This has not been implemented yet");
    }

    public Expression getX() {
        return x;
    }

    public Expression getY() {
        return y;
    }

    @Override
    public Expression getMagnitude() {
        return magnitude;
    }

    @Override
    public Expression getAngle() {
        return angle;
    }

    @Override
    public Point getOrigin() {
        return origin;
    }

    @Override
    public Vector mul(int s) {
        return new Vector2D(origin, new Mul(magnitude, new Int(s)), angle);
    }
}
