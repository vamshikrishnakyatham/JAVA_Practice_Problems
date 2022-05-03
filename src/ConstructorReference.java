package Lambdas;

public class ConstructorReference {
    class Movie{
        //Constructor1
        public Movie(int id){
        }
        //Constructor2
        public Movie(int id,String name){
        }
    }
    interface MovieFactory{
        public Movie create(int id);
    }
    MovieFactory m1 = i -> new Movie(i);
    MovieFactory m2 = Movie::new;
    public static void main(String[] args){
        ConstructorReference client =  new ConstructorReference();
    }
}
