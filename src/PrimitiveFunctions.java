package Functions;

import java.util.function.*;

public class PrimitiveFunctions {
    Predicate<Integer> evenNumberPredicate = x -> x%2==0 ;
    IntPredicate evenNumberPredicate2 = x -> x%2==0 ;

    Predicate<Double> doublePredicate = x -> x >10 ;
    DoublePredicate doublePredicate2 = x -> x >10 ;
    LongPredicate longPredicate = null;

    //Consumers
    IntConsumer intConsumer = null;
    DoubleConsumer doubleConsumer = null;
    LongConsumer longConsumer = null;

    //Suppliers
    IntSupplier intSupplier;
    DoubleSupplier doubleSupplier ;
    LongSupplier longSupplier;

    Function<Integer,Employee> empFunction = null;

    IntFunction<Employee> empFunction2 = null;
    DoubleFunction<Employee> doubleEmpFunction;
    LongFunction<Employee> longEmpFunction;

    Function<Double,Integer> doubleToIntegerFunction = null;
    DoubleFunction<Integer> doubleToIntegerFunction2;

    //Primitive functions
    DoubleToIntFunction doubleToIntegerFunction3;

    private void testPredicate(int i){
        System.out.println("Even Number?"+evenNumberPredicate2.test(i));
    }
    public static void main(String[] args){
        int evenNum=20;
        new PrimitiveFunctions().testPredicate(evenNum);
    }
}
