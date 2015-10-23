import java.util.Scanner;
public class coinFlip{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter an integer between 0 to 100 for the # of coin flips and to find the ratio. ");
            int Flips=scan.nextInt();
            if (Flips==0){
                flip(Flips);
            }
            else if(0<Flips&&Flips<=100){
                flip(Flips,true);
            }
            else{
                break;
            }
        }
    }
    public static void flip(int x) {
        int nheads=0;
        int ntails=0;
        while (true){
            int flip=(int)(Math.random()*10);
            if (flip==0){
                nheads++;
                break;
            }
            else if(flip==1) {
                ntails++;
                break;
            }
        }
        System.out.println("The ratio is (tails,head): ("+ntails+","+nheads+")");
    }
    public static void flip(int x, boolean z) {
        int head=0;
        int tail=0;
        int flip=0;
        for (int y=0; y<x; y++){
            while (true){
                flip=(int)(Math.random()*10);
                if (flip== 0||flip==1){
                    break;
                }
            }
            if (flip==0) {
                head++;
            }
            else if(flip==1){
                tail++;
            }
        }
        System.out.println("The ratio is (tails,head): ("+tail+","+head+")");
    }
}