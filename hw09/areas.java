import java.util.Scanner;
public class areas{
    public static void main(String [] args){
        Scanner myScanner= new Scanner (System.in);
        System.out.print("Please enter a shape you want to compute (circle, rectangle, or trapezoid): ");
        String shape = myScanner.next();
        double vArea;
        if(shape.equals("circle")){
            System.out.print("Enter the value of your radius: ");
            int radius=myScanner.nextInt();
            vArea=area(radius);
            System.out.println("The area of your circle is "+vArea);
        }
        else if(shape.equals("trapezoid")){
            System.out.print("Enter the value of first base: ");
            int base1=myScanner.nextInt();
            System.out.print("Enter the value of second base: ");
            int base2=myScanner.nextInt();
            System.out.print("Enter the value of height: ");
            int height=myScanner.nextInt();
            vArea=area(base1,base2,height);
            System.out.println("The area of your rectangle is "+vArea);
        }
        else if(shape.equals("rectangle")){
            System.out.print("Enter the value of length: ");
            int length=myScanner.nextInt();
            System.out.print("Enter the value of width: ");
            int width=myScanner.nextInt();
            vArea=area(length,width);
            System.out.println("The area of your rectangle is "+vArea);
        }
        else{
            System.exit(-1);
        }
        
    }
    public static double area(int r){
        int xRadius=r;
        double area=(r*r)*3.14;
        return area;
        
    }
    public static double area(int l, int w){
        int xLength=l;
        int xWidth=w;
        double area=xLength*xWidth;
        return area;
        
    }
    public static double area(int b1, int b2, int h){
        int xBase1=b1;
        int xBase2=b2;
        int xHeight=h;
        double area=((xBase2+xBase1)/2)*xHeight;
        return area;
    }
}