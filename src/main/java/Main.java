public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(2, 3);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        int d = calc.abs.apply(-9);
        boolean value = calc.isPositive.test(-1);

        calc.println.accept(c);
        calc.println.accept(d);

    }
}
