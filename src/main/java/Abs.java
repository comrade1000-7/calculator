import java.util.function.UnaryOperator;

public interface Abs {
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

}
