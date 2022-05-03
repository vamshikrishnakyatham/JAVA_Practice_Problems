package interfaces;

interface Engine{
    default String make(){
        return "Default Make";
    }
}

interface Vehicle{
    default String model(){
        return "Defauult Model";
    }
}

class Car implements Vehicle,Engine{
    String makeAndModel(){
        return Engine.super.make()+Vehicle.super.model();
    }
}
public class InheritingBehaviour {
}
