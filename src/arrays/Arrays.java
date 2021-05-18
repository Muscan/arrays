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
    //Product of even numbers
    public static int productEvenArray(int[] arr){
        int productEven = 1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2 == 0)
                productEven *=arr[i];
        }
        return productEven;
    }
    //Return number of even numbers
    public static int evenNrArray(int[] arr){
        int numberOfEven = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2 == 0)
                numberOfEven++;
        }
        return numberOfEven;
    }

    //Return the max number from an array
    public static int maxNrArray(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
                max = arr[i];
            /**
             * If a number FROM THE ARRAY  is GREATER than max, max takes that number's value
             * This means that while going through the array, max always keeps the current max value
             */
        }
        return max;
    }
    public static int maxEven(int[] arr){
        int evenMax = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>evenMax && arr[i]%2 == 0)
                evenMax = arr[i];
        }
        return evenMax;
    }
    //Sum of negative numbers
    public static int sumNegative(int[] arr){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<0)
                sum += arr[i];
        }
        return sum;
    }

    //Prime numbers from an array
    public static int primeNumbers(int[] arr){
        int prime = 0;//the number of prime numbers in the arrau
        for (int i = 0; i < arr.length; i++) {//we go through the whole array
            boolean isPrime = true;// we keep this to know if a number is prime. If it is the values will remain true, otherwise false
            for (int j = 2; j < arr[i]/2; j++) {// j goes from 2 to the half of the number. If the number (arr[i]) divides with j, it means it is not prime as it has multiple divisors
                if(arr[i]%j == 0)//if it (arr[i]) has divisors
                    isPrime = false;//it is not prime
            }
            if(isPrime)//if the number is prime
                prime++;//the number of primes increases
        }
        return prime;
    }


}
