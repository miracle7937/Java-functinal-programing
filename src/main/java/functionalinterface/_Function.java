package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment =  increment(0);
        System.out.println(increment);

        int increment2 =  incrementFunction.apply(20);
        System.out.println(increment2);

        int incrementByFunction = integerIntegerIntegerBiFunction.apply(103,55);
        System.out.println(incrementByFunction);

    }

    static Function<Integer, Integer> incrementFunction = number-> number+1 ;

    static  int increment(int number){
        return   number+1;
    }



    static BiFunction<Integer, Integer, Integer>  integerIntegerIntegerBiFunction
            = ( number,  numToMultiply)->(number+1)*numToMultiply;
    static  int incrementByOneAndMultiply(int number, int numToMultiply){
        return   (number+1)*numToMultiply;
    }
}
