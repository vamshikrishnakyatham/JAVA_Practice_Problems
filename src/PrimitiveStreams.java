package Streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    private void intStream(){
        int[] ints = new int[]{2,4,6,8,10};
        IntStream intStream = IntStream.of(ints);
        intStream.forEach(System.out::println);

        IntStream intStream1 = IntStream.of(2,4,6,8,10);
        intStream1.forEach(System.out::println);
    }
    private void doubleStreams(){
        double[] d = new double[]{2.2,4.4,6.1,8.3,10.7};
        DoubleStream doubleStream = DoubleStream.of(d);
        doubleStream.forEach(System.out::println);

        DoubleStream doubleStream1 = DoubleStream.of(2.2,4.4,6.1,8.3,10.7);
        doubleStream1.forEach(System.out::println);

    }
    private void convertStreams(){

    }
    public static void main(String[] args){
        new PrimitiveStreams().intStream();
        new PrimitiveStreams().doubleStreams();
    }
}
