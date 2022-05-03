import java.util.Scanner;

public class Prj3_1_LearningPackages {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int packageNumber;
         int howManyCourses;
         int basecost;
         int costPerCourse;
         int numIncluded;
         int totalcost;
        System.out.println("Choose package Number:");
        packageNumber=sc.nextInt();
        System.out.println("How many courses did u enroll");
        howManyCourses=sc.nextInt();
        if(packageNumber==1){
            basecost=10;
            costPerCourse=6;
            numIncluded=2;
        }
        else if(packageNumber==2){
            basecost=12;
            costPerCourse=4;
            numIncluded=4;
        }
        else {
            basecost=15;
            costPerCourse=3;
            numIncluded=6;
        }
        if(howManyCourses>numIncluded){
            totalcost=basecost+(howManyCourses-numIncluded)*costPerCourse;
        }
        else {
            totalcost=basecost;
        }
        System.out.println("Total cost is : "+totalcost);

    }
}
