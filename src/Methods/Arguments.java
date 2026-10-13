package Methods;

public class Arguments {

     void sum(int a , int b){
        int c = a + b;
         System.out.print("The sum is: " + c);
    }

    public static void main(String[] args) {
         Arguments a1 = new Arguments();
         a1.sum(2 , 5);
    }
}
