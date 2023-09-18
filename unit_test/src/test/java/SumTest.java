package test.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SumTest {


    @ParameterizedTest
    @MethodSource("validData")
    void sumOfTwoNumbers(int expectedResult, int a, int b) {
        Sum sum = new Sum();
        assertEquals(expectedResult, sum.sumOfTwoNumbers(a,b),"incorrect calculation test");
     }

         static Stream<Arguments> validData(){
             return Stream.of(
                     arguments(5, 3, 2),
                     arguments(-9, -5, -4),
                     arguments(-1, -2, 1),
                     arguments(1 , 3, -2),
                     arguments(0, 0, 0),
                     arguments(120, 0, 120),
                     arguments(340, 340, 0)
             );
         }

     }
