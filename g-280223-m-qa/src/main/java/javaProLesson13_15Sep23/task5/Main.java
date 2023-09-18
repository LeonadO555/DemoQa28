package javaProLesson13_15Sep23.task5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        //
        String[] world={"AAAA","BBB","CCCCC","BBB","DDDD","DD"};
        System.out.println("entered array : "+ Arrays.toString(world));
        //
        Set<String>result =getSetFromArray(world,x->x+x);
        Set<String>result1 =getSetFromArray(world,x->x);
        System.out.println("#1 "+result);
        System.out.println("#2 "+result1);
        Set<String>result3 =getSetFromArray(world,x->x+" >>length:"+x.length());
        System.out.println("#3 "+result3);
        //
        Set<String>result4 =getSetFromArray(world,Function.identity());
        System.out.println("#4 "+result4);

    }

    public static Set<String> getSetFromArray(String[] array, Function<String, String> function) {
        Set<String> result = new HashSet<>();
        for (String element : array) {
            String processedElement = function.apply(element);
            result.add(processedElement);
        }
        return result;
    }
}
