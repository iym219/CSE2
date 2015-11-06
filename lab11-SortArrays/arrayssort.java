public class arrayssort{
    public static void main(String[] args){
        int[] array3=new  int[30];
        int[] array1= new int[20];
        int[] array2= new int[10];
        for(int i=0;i<array1.length;i++){
            array1[i]=(int)(Math.random()*100);
            array3[i]=array1[i];
        }
        for(int j=0;j<array2.length;j++){
            array2[j]=(int)(Math.random()*100);
            array3[j+20]=array2[j];
        }
        sort(array1);
        System.out.println("");
        sort(array2);
        System.out.println("");
        sort(array3);
        System.out.println("");
    }
    public static void sort(int[] array1){
        int x;
        for(int sortY=0;sortY<array1.length;sortY++){
            for(int sortZ=0;sortZ<array1.length;sortZ++){
                if(array1[sortY]<array1[sortZ]){
                    x=array1[sortZ];
                    array1[sortZ]=array1[sortY];
                    array1[sortY] = x;
                }
            }
        }
        for(int printArray=0; printArray<array1.length;printArray++){
            System.out.print(array1[printArray]+" ");
            }
    }
}