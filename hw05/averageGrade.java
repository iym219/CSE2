import java.util.Scanner;
public class averageGrade{
    public static void main(String [] args){
        Scanner myScanner= new Scanner (System.in);
        int nTrials=0, average, totalG=0, valueG;
        do{
            System.out.print("Enter your grade or enter 999 to stop: ");
            valueG=myScanner.nextInt();
            if(valueG>0){
                nTrials++;
                totalG+=valueG;}
            else if(valueG<100){
                nTrials++;
                totalG+=valueG;
            }
            else if(valueG<0){
                    System.out.println("Invalid Grade ");
            }
            else if(valueG>100 && valueG!=999){
                System.out.println("Invalid Grade ");
            }
        }
        while(valueG==999);{
            average=totalG/nTrials;
            System.out.println("Your average is "+average+".");
        }
    }
}