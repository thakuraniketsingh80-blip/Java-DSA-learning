package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] x = {2 , 5 , 4 , 8 , 99 , 42 , 54 };
        // Indexing

        System.out.println("The 5th index element: " + x[5]);
        System.out.println("The 3rd index element: " + x[3]); //  Access
        System.out.println("The 0 index element: " + x[0]);


        //  Updating Elements

        x[3] = 69;
        x[5] = 59;
        System.out.println("The updated element: " + x[3]);
        System.out.println("The updated element: " + x[5]);



        //  Second Method to declare array and initialize

        int[] arr = new int[5];
        arr[0] = 18;
        arr[1] = 14;
        arr[2] = 4;
        arr[3] = 62;
        arr[4] = 13;

    }
}
