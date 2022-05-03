package Lambdas;

public class TargetType {
    public interface Email{
        String constructionEmail(String name);
    }
    Email email = (String name) -> name+"@zemososlabs.com";
    public String getEmail(String name,Email email){
        return null;
    }
    public static void main(String[] args){
        new TargetType().getEmail("sahithi",(String name) -> name+"@zemososlabs.com");
    }
}
