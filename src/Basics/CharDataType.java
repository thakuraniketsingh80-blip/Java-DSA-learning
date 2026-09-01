package Basics;

public class CharDataType {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println(ch);

        char ch1 = 'a'; // ASCII value of 'a'
        System.out.println((int) ch1); // Output: 97

        char ch2 = '3'; // ASCII value of '3'
        System.out.println((int) ch2); // Output: 51

        int a = ch;  //implicit type casting from char to int
        System.out.println(a); // Output: 65

        int b = (int) ch1;  //explicit type casting from char to int
        System.out.println(b); // Output: 97

        System.out.println(ch1 * ch1); //can perform any operation in ASCII value

        //Int to Char Type-Casting

        int x  = 65;
        char y = (char)x;
        System.out.println(y);
    }
}