package Statics;

import Calc.*;
import Calc.Int;

public class Vector2D {
    private Expression x;
    private Expression y;
    private Point origin;

    public Vector2D(Point point, Expression x, Expression y) {
        this.x = x;
        this.y = y;
        this.origin = point;
    }
    public Vector2D(Expression x, Expression y) {this(new Point(), x, y);}
    public Vector2D(Point point, Expression magnitude, Expression angle, boolean isMagnitude) {
        this(point, new Mul(magnitude, new Cos(angle)), new Mul(magnitude, new Sin(angle)));
    }
    public Vector2D(Expression magnitude, Expression angle, boolean isMagnitude) {
        this(new Point(), magnitude, angle, isMagnitude);
    }
    public Vector2D(int x, int y) {this(new Int(x), new Int(y));}
    public Vector2D(int magnitude, int angle, boolean isMagnitude) {
        this(new Int(magnitude), new Int(angle), isMagnitude);
    }


    public Expression getX() {
        return x;
    }

    public Expression getY() {
        return y;
    }

     public Expression getMagnitude() {
        return new Sqrt(new Add(new Mul(x, x), new Mul(y, y)));
    }

     public Expression getAngle() {
        return new Atan2(y, x);
    }

     public Point getOrigin() {
        return origin;
    }

    public Vector2D mul(int s) {
        return new Vector2D(origin, new Mul(x, new Int(s)), new Mul(y, new Int(s)));
    }

     public Vector2D add(Vector2D v) {return new Vector2D(origin, new Add(x, v.getX()), new Add(y, v.getY()));}

     public Expression dot(Vector2D v) {
        return new Add(new Mul(x, v.getX()), new Mul(y, v.getY()));
    }
}
