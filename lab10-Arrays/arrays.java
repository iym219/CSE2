import java.util.Scanner;
public class arrays{
    public static void main (String [] args){
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter the numbers of arrays that you want ");
        int nArray=myScanner.nextInt();
        int [] array = new int [nArray];
        for(int x=0;x<nArray;x++){
            array [x]=(int) (Math.random()*100);
        }
        for(int y=0;y<nArray;y++){
            System.out.println(array[y]);
        }
        int sum=0;
        for(int z=0;z<nArray;z++){
            sum+=array[z];
        }
        double av=(double)sum/(double)nArray;
        System.out.println("The total sum of all the array numbers is "+sum+" The average with the arrays is "+av);
        for(int w=0;w<nArray;w++){
            if(array[w]>=av){
                System.out.println("The numbers greater than the average are "+array[w]);
            }
        }
        return;
    }
}