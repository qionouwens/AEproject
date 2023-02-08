package Statics;

import Calc.Expression;
import Calc.Int;

public interface Vector {

    Expression getMagnitude();
    Expression getAngle();
    Point getOrigin();

    Vector mul(int s);
    Vector add(Vector v);
    Int dot();
}
