package test.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CostTest {

    private short expectedResults;

    @ParameterizedTest
    @MethodSource("validData")
        //   @Test

    void deliveryCostCalc(double expectedResults, double distance, boolean big, boolean fragile, String load) {
        Cost cost = new Cost();
        assertEquals(expectedResults, cost.deliveryCostCalc(distance,big,fragile,load),"incorrect calculation test");

    }
        static Stream<Arguments> validData () {
            return Stream.of(
                    arguments(660, 0.1, true, true, "повышенная"),
                    arguments(880, 1, true, true, "очень высокая"),
                    arguments(540, 2, false, true, "повышенная"),
                    arguments(400, 5, false, false, "высокая"),
                    arguments(400, 9.9, true, false, "обычная"),
                    arguments(800, 10, false, true, "очень высокая"),
                    arguments(420, 15, false, false, "высокая"),
                    arguments(840, 30, true, true, "повышенная"),
                    arguments(400, 30.1, false, false, "обычная")

            );
            // System.out.println(cost.deliveryCostCalc(2, true, false, "высокая"));

            //     assertEquals(0, cost.deliveryCostCalc(0,true,true,"повышенная"));
            //  bag : Expected :0.0   Actual   :660.0

      /*
        assertEquals(660, cost.deliveryCostCalc(0.1,true,true,"повышенная"));
        assertEquals(880, cost.deliveryCostCalc(1,true,true,"очень высокая"));
        assertEquals(540, cost.deliveryCostCalc(2,false,true,"повышенная"));
        assertEquals(400, cost.deliveryCostCalc(5,false,false,"высокая"));
        assertEquals(400, cost.deliveryCostCalc(9.9,true,false,"обычная"));
        assertEquals(800, cost.deliveryCostCalc(10,false,true,"очень высокая"));
        assertEquals(420, cost.deliveryCostCalc(15,false,false,"высокая"));
        assertEquals(840, cost.deliveryCostCalc(30,true,true,"повышенная"));
        assertEquals(400, cost.deliveryCostCalc(30.1,false,false,"обычная"));
     */
            // assertEquals(0, cost.deliveryCostCalc(45,true,true,"очень высокая"));
            //java.lang.IllegalArgumentException: Хрупкие грузы нельзя возить далее 30 км


        }
    }
