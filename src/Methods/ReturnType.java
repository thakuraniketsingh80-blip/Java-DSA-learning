package Methods;

public class ReturnType {
    public static int addition(int a , int b){
        int c = a + b;
        return c;
    }

    public static void main(String []args){
        int c = addition(10 , 20);
        System.out.print("the sum of a and b without object  is: " + c);
    }
}
