package Interfaces;

import java.util.function.Predicate;

public interface IsPositive {
    Predicate<Integer> isPositive = x -> x > 0;

}
