import java.util.Scanner;
public class Methods{
    

    public static double median(double m1, double m2){
        double med = (m1 + m2)/2;
        return med;
    }
    
    public static double mean(double sum){
        double m = sum/10;
        return m;
        
    }
    
    public static void print(double mean, double median){
        
        System.out.println("Mean: " + mean + " , Median: " + median);
    }
    
    public static void main(String [] args){

        double m1 = 0;
        double m2 = 0;
        double sum = 0;
        double temp = 0;
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please input the first of 10 number to calculate the median and mean. ");
        
        
        
        for(int i = 0; i < 10; i++){
            
            if(i == 4){
                m1 = myScanner.nextDouble();
                sum += m1;
            }
            else if(i == 5){
                m2 = myScanner.nextDouble();    
                sum += m2;
            }
            else{
                temp = myScanner.nextDouble();
                sum += temp;
            }
        }
        
        double mean = mean(sum);
        double med = median(m1, m2);
        print(mean, med);
    }
}