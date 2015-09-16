import java.util.Scanner;
public class Timer{
    public static void main(String [] args){
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter the current time: ");
        double curTime = myScanner.nextDouble();
        System.out.print("Enter the time that you will be eating dinner: ");
        double dinnerTime = myScanner.nextDouble();
        int remainTime;
        int hours; 
        int minutes;
        remainTime= (int) (dinnerTime-curTime);
        hours= (int) remainTime/100;
        minutes= (int) (remainTime)%100;
        //FIND THE MINUTES
        System.out.println("You have "+hours+" hours and "+minutes+" minutes until dinner.");
    }
}