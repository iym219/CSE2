//The import variable is to bring the program so we can get a response from the user
import java.util.Scanner;
public class Check{
    public static void main (String [] args){
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble();
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent= myScanner.nextDouble();
        tipPercent /=100;
        //Line 9 is to convert the percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople=myScanner.nextInt();
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies;
        totalCost=checkCost*(1+tipPercent);
        costPerPerson=totalCost / numPeople;
        dollars=(int)costPerPerson;
        //Line 20&21 have the percentage sign to return the remainder
        dimes=(int) (costPerPerson*10)%10;
        pennies=(int) (costPerPerson*100)%10;
        System.out.println("Each person in the group owes $"+dollars + '.' +dimes+pennies);
    }
}