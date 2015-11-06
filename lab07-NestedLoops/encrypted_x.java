import java.util.Scanner;
public class encrypted_x{
    public static void main(String [] args){
        Scanner myScanner= new Scanner(System.in);
        System.out.print("Choose your size for X. Only between 0-100. ");
        int input=myScanner.nextInt();        
        int j,i;
        if(input<100 && input>0){
            for (i=0;i<input;i++){
                for(j=0;j<input;j++){
                    if((input-i)==j+1){
                        System.out.print(" ");
                    }
                    else if(i==j) {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        else{
            System.exit(-1);
        }
    }
}