import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class TestCalculator {
        Calculator calculator = Calculator.instance.get();

        @Test
        public void testPlus() {
                int expected = 5;
                int actual = calculator.plus.apply(2, 3);

                assertThat(expected, equalTo(actual));
        }

        @ParameterizedTest
        @CsvSource({"10, 7, 3","20, 15, 5"})
        public void testMinus(int a, int b, int expected) {
                int actual = calculator.minus.apply(a, b);

                assertThat(expected, equalTo(actual));
        }

        @ParameterizedTest
        @CsvFileSource(resources = "data.csv")
        public void testMultiply(int a, int b, int expected) {

                int actual = calculator.multiply.apply(a, b);

                assertThat(expected, equalTo(actual));
        }

        @ParameterizedTest
        @CsvFileSource(resources = "data2.csv")
        public void testIsPositive(int a, boolean expected) {
                boolean actual = calculator.isPositive.test(a);

                assertThat(expected, equalTo(actual));
        }

        @Test
        public void testAbs() {
                int expected = 5;
                int actual = calculator.abs.apply(-5);

                assertThat(expected, equalTo(actual));
        }
}
