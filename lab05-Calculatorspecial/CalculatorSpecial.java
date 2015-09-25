import java.util.Scanner;
public class CalculatorSpecial{
    public static void main(String [] args){
        Scanner myScanner = new Scanner (System.in);
        Boolean y= true;
        while (y== true){
            System.out.print("Enter the value for x: ");
            int valueX = myScanner.nextInt();
            System.out.print("Enter the value for y: ");
            int valueY = myScanner.nextInt();
            System.out.print("Enter an operator: ");
            String operator=myScanner.next();
            int valueA= valueX+valueY;
            int valueS= valueX-valueY;
            int valueD= valueX/valueY;
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
            System.out.print("WWould you like to continue? Type n or N to stop: ");
            String no =myScanner.next();
            if (no.equals("n") || no.equals("N")) {
                y = false;
            }
        }
        return;
    }
}
