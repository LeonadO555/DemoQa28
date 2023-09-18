package javaProLesson13_15Sep23.task1;

import java.util.function.Function;

public class MyFunction implements Function<Double, Long> {

    @Override
    public Long apply(Double value) {
        return Math.round(value);
    }


}
