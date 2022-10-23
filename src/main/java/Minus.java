import java.util.function.BinaryOperator;

public interface Minus {
    BinaryOperator<Integer> minus = (x, y) -> x - y;
}
