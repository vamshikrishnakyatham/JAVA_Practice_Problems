package Lambdas;

public class CreatingLambdas {
    interface Greeting{
        public String sayHello(String g);
    }
    public void testGreeting(String a,Greeting g){
        String result = g.sayHello(a);
        System.out.println("Result:"+result);
    }
    public static void main(String[] args){
        new CreatingLambdas().testGreeting("Harry",(String s) -> "Hello, "+s);
        new CreatingLambdas().testGreeting("Miss Pingu",(String s) -> "Hello, "+s);
        new CreatingLambdas().testGreeting("",(String p) -> !p.isEmpty()?"Howdy, "+p :"Did you miss something");

    }
}
