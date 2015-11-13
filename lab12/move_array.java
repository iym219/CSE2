import java.util.Scanner;
public class move_array{
    public static void main(String [] args){
        Scanner myScanner= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int x= myScanner.nextInt();
        try{
            int[] array1 = new int[x];
        }
        catch(NegativeArraySizeException e){
            System.exit(-1);
        }
        int [] array1= new int[x];
        for(int i=0; i<array1.length;i++){
            array1[i]=(int)(Math.random()*100);
             System.out.print(array1[i]+" ");
        }
        System.out.println();
        System.out.print("Choose an index value to index to the end: ");
        int y=myScanner.nextInt();
        int val = 0;
        try{
            val = array1[y];
        }
        catch(IndexOutOfBoundsException e){
            System.exit(-1);
        }
        int valueX = 0;
        int j;
        valueX=array1[y];
        for(j=y;j<array1.length-2; j++){
            array1[j] = array1[j+1];
            // System.out.print(valueX + " ");
        }
        array1[j] = array1[j+1];
        j++;
        array1[j] = valueX;
        System.out.println("Array: ");
        for(x = 0; x < array1.length; x++){
            System.out.println(array1[x]);
    
        }
        }
}