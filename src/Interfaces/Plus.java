package Interfaces;

import java.util.function.BinaryOperator;

public interface Plus {
    BinaryOperator<Integer> plus = (x, y) -> x + y;
}
