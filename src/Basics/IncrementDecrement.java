package Basics;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 10 ;
        int y = 1 ;
        int z = 4 ;
        int a = 8 ;

        int num = 15;
        int num2  = num++;  //initializes num2 then increased

        System.out.println(num2);
        System.out.println(num);

        System.out.println(x++); //prints the value then increased
        System.out.println(++y); //increased the value then prints

        System.out.println(--z); //decreased the value then prints
        System.out.println(a--); //prints the value then decreased

    }
}
