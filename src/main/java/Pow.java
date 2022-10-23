import java.util.function.UnaryOperator;

public interface Pow {
    UnaryOperator<Integer> pow = x -> x * x;

}
