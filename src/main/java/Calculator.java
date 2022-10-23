import java.util.function.*;

public class Calculator implements Plus, Minus, Multiply, Devide, Abs, Pow, IsPositive, Println {
    static Supplier<Calculator> instance = Calculator::new;
}
