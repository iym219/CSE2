public class 101415Notes{
    public static void hw(){
        System.out.println("Hello World");
    }
    public static void add(int a, int b){
        System.out.println("add= "+(a+b));
    }
    public static int add(int a, int b){
        return a+b;
        //or
        int c;
        c=a+b;
        return c;
    }
    public static book lsMut2(int a){
        if (a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        System.out.println("Hello");
        hw ();//This is to bring the method to the main method and execute the code
        add(3,8);//This is a method where you have state the variables that were previously shown in a different method
    }
}