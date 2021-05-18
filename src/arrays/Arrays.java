package arrays;

public class Arrays {
    //Method which display the elements of an array
    public static void displayArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    //Calculate the sum of elements from an array
    public static int sumArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum;
    }
    //Product of elements from an array
    public static int productArray(int[] arr){
        int product = 1;
        for (int i = 0; i <arr.length ; i++) {
            product*=arr[i];

        }
        return product;
    }


}
