import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class CalculatorTest {
        Calculator calculator;

        @BeforeEach
        public void setup() {
                calculator = Calculator.instance.get();
        }

        @Test
        public void shouldSumNumbers() {
                int expected = 5;
                int actual = calculator.plus.apply(2, 3);

                assertThat(expected, equalTo(actual));
        }

        @ParameterizedTest
        @MethodSource("providesValuesForSubtract")
        public void shouldSubtractNumbers(int a, int b, int expected) {
                int actual = calculator.minus.apply(a, b);

                assertThat(expected, equalTo(actual));
        }

        public static Stream<Arguments> providesValuesForSubtract () {
                return Stream.of(
                        Arguments.of(10, 7, 3),
                        Arguments.of(20, 15, 5)
                );
        }

        @ParameterizedTest
        @CsvFileSource(resources = "data.csv")
        public void shouldMultiplyNumbers(int a, int b, int expected) {

                int actual = calculator.multiply.apply(a, b);

                assertThat(expected, equalTo(actual));
        }

        @ParameterizedTest
        @CsvFileSource(resources = "data2.csv")
        public void shouldAnswerIsPositive(int a, boolean expected) {
                boolean actual = calculator.isPositive.test(a);

                assertThat(expected, equalTo(actual));
        }

        @Test
        public void shouldReturnPositiveNumber() {
                int expected = 5;
                int actual = calculator.abs.apply(-5);

                assertThat(expected, equalTo(actual));
        }
}
