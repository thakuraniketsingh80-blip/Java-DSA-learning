package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 , 40};
        int[] x = arr ;     //  x is Shallow copy of arr

        x[0] = 100;
        System.out.println(arr[0]);

        int[] deep = Arrays.copyOf(arr , arr.length);

        deep[1] = 5;
        System.out.println(arr[1]);
        System.out.println(deep[1]);
    }
}
