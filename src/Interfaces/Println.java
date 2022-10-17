package Interfaces;

import java.util.function.Consumer;

public interface Println {
    Consumer<Integer> println = System.out::println;

}
