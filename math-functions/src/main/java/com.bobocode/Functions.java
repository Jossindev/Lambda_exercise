package com.bobocode;

public class Functions {
    /**
     * A static factory method that creates an integer function map with basic functions:
     * - abs (absolute value)
     * - sgn (signum function)
     * - increment
     * - decrement
     * - square
     *
     * @return an instance of {@link FunctionMap} that contains all listed functions
     */
    public static FunctionMap<Integer, Integer> intFunctionMap() {
        FunctionMap<Integer, Integer> intFunctionMap = new FunctionMap<>();

        // todo: add simple functions to the function map (abs, sng, increment, decrement, square)
        intFunctionMap.addFunction("increment", x ->x+1);
        intFunctionMap.addFunction("decrement", x->x-1);
        intFunctionMap.addFunction("abs", Math::abs);
        intFunctionMap.addFunction("sgn", Integer::signum);
        intFunctionMap.addFunction("square", x->x*x);


        return intFunctionMap;
    }
}
