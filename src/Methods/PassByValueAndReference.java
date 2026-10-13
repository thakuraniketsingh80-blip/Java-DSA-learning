package Methods;

public class PassByValueAndReference {
    public static void change(int x){           //Formal Variable
        x = 10;
    }
    public static void main(String[] args) {
        int x = 6;          // Actual variable
        change(x);
        System.out.println(x);
    }
}
