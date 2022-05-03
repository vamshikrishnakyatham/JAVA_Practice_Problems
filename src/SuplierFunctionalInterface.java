package Functions;

import java.util.List;
import java.util.function.Supplier;

public class SuplierFunctionalInterface {
    Supplier<String[]> fruitSupplier = () -> new String[]{"Apple","Orange"};
    private void testSupplier(){
        String[] fruits = fruitSupplier.get();
        for (String fruit : fruits) {
            System.out.println("Fruit is "+fruit);
        }
    }
    public static void main(String[] args){
        new SuplierFunctionalInterface().testSupplier();
    }
}
