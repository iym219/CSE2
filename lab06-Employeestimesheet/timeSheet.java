import java.util.Scanner;
public class timeSheet{
    public static void main(String [] args){
        Scanner myScanner= new Scanner (System.in);
        int nEmployees=0;
        double pWeek;
        System.out.print("Enter the number of employees to read in. ");
        nEmployees=myScanner.nextInt();
        while(nEmployees>0){
            System.out.print("Enter the employee's pay per hour in cents. Enter negative number to exit:");
            double pHour=myScanner.nextDouble();
            if(pHour < 0){
                break;
            }
            System.out.print("Enter the number of hours of the same employee will be working. ");
            int nHours=myScanner.nextInt(); 

            //while(nEmployees>0){
                //System.out.print("Enter the number of hours of the same employee will be working. ");
                //int nHours=myScanner.nextInt();
            nEmployees--;
            pWeek=pHour*nHours;
            System.out.println("Your employees' pay for the week are: "+pWeek);
        }
    }
}