package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(0);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> incrementAndThenMultiply = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(incrementAndThenMultiply.apply(10));

        int result = incrementAndMultiply.apply(1, 10);
        System.out.println(result);
    }

    static int incrementByOne(int number) {
        return number + 1;
    }

    // Lambda
    static Function<Integer, Integer> incrementByOneFunction =
            number -> ++number;

    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementAndMultiply = (increment, multiply) -> (increment + 1) * multiply;

}
