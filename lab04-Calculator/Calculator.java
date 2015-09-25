import java.util.Scanner;
public class Calculator{
    public static void main(String [] args){
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter the value for x: ");
            int valueX = myScanner.nextInt();
            System.out.print("Enter the value for y: ");
            int valueY = myScanner.nextInt();
            System.out.print("Enter an operator: ");
            String operator=myScanner.next();
            int valueA= valueX+valueY;
            int valueS= valueX-valueY;
            double valueD= valueX/valueY;
            int valueM= valueX*valueY;
            switch (operator){
                case "*":
                System.out.println(valueM);
                break;
                case "/":
                System.out.println(valueD);
                break;
                case "-":
                System.out.println(valueS);
                break;
                case "+":
                System.out.println(valueA);
                break; }
    }            
}    