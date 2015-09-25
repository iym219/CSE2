import java.util.Scanner;
public class 91615Notes{
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a number between 1 and 10 ");
        int num = scan.nextInt ();
        if (num==0){System.out.print("Zero");}
        else (num == 1) {System.out.println("One");}
        switch (num) {
            case 1: 
            System.out.println("One");
            case 2:
                System.out.println("Two");
        }
    }
}
//command switch
// works like if else, if
// make sure to use break so that the rest of the options are not listed