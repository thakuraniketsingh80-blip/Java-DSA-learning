package Basics;

public class TsaOfCuboid {
    public static void main(String[] args) {
        double  length = 10;
        double  width = 5;
        double  height = 9;

        double tsa = 2 * (length * width * height) * (length * width * height);

        System.out.println(tsa);
    }
}
