package test.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DiscountTest {

    @ParameterizedTest
    @MethodSource("validData")
    void discountCalcOfTwoNumbers(int expectedResult, int a, int b) {

        Discount discount = new Discount();
        assertEquals(expectedResult, discount.discountCalc(a, b), "incorrect calculation test");
    }

    static Stream<Arguments> validData() {
        return Stream.of(
                arguments(2, 2, 0),
                arguments(4, 4, 1),
                arguments(0, 3, 0),
                arguments(2, 3, 1)

        );
        //  assertEquals(0, discount.discountCalc(0,0));
        //   assertEquals(2, discount.discountCalc(2, 0));
        //   assertEquals(4, discount.discountCalc(2, 1));
        //    assertEquals(2, discount.discountCalc(5,1));

    }
}