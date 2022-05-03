package Lambdas;

public class ArrayReference {
    interface StringArray{
        String[] create(int size);
    }
    private void testArrayConstructorReferences(){
        StringArray sArray = (size) -> new String[size];
        StringArray sArray2 = String[]::new;
    }
}
