package Interfaces;

import java.util.function.BinaryOperator;

public interface Devide {
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;
}
