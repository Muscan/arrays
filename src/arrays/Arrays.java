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
        int prime = 0;//the number of prime numbers in the array
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

    //Diff in abs. value between total nr. of even and odd numbers
    public static int nrValEven(int[] arr){
        int countEven = 0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]%2 == 0)
                countEven++;
        }
        return countEven;
    }

    public static int nrValOdd(int[] arr){
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 1)
                countOdd++;

        }
        return countOdd;
    }

    public static int absValue(int[] arr){
        return Math.abs(nrValEven(arr) - nrValOdd(arr));
    }

    //Display the elements which are multiples of the last element
    public static int multiplesLastElement(int[] arr){
        //ex: multiples of 3 are 0, 3, 6, 9, 12
        int lastElementOfArray = arr[arr.length-1];
        int multiplesCounter = 0;
        for (int i = 0; i <arr.length-1; i++) {
            if (arr[i]%lastElementOfArray == 0)
                multiplesCounter++;
        }
        return multiplesCounter;
    }

    //Display pairs of: first, last, second last-1, etc.
    public static void pairsOfArray(int[] myArray){

        for (int i = 0, j=myArray.length-1; i<j; i++, j--) {
            System.out.println("Pairs: "+"("+ +myArray[i]+", "+myArray[j]+")");
        }
    }

    //Max and min element from an array
    public static int minValueOfArray(int[] arr){
        //suppose that the min is it`s first index
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue)
                minValue = arr[i];
        }
        return minValue;
    }

    public static int maxValueOfArray(int[] arr){
        int maxValue = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > maxValue)
                maxValue = arr[i];
        }
        return maxValue;
    }

    public static String minMaxValuesOfArray(int[] arr){

        return "The minimum value from the array is " +minValueOfArray(arr)+" , and the max value is "+maxNrArray(arr);
    }

    //Calculate the sum between first and last even element of an array
    public static int positionFirstEvenElement(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2 == 0) {
                return i;
            }
        }
        return -1;
    }

    //position of the last even Number
    public static int positionLastEvenElement(int[] arr){
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i]%2 == 0)
                return i;
        }
        return -1;
    }
    public static int sumEvenElements(int[] arr){
        int sum = 0;
        for (int i = positionFirstEvenElement(arr); i <= positionLastEvenElement(arr) ; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //Display how many of the elements are greater than the avg value of the array

    public static int averageArray(int[]arr){
        return sumArray(arr)/arr.length;
    }

    public static int valuesGreaterThan(int[]arr){
    int countElemente = 0;
        for (int i = 0; i <arr.length ; i++) {
        if(averageArray(arr)<arr[i])
            countElemente ++;
    }
        return countElemente;
    }

    // how many elements are out of the closed array determined by the first and last element.

    //Method which checks if a number is in an interval
    //Example:int[] example ={ 2 0.5 4 -1 -8 -3};
    //Output: 2
    //Explanation: 4, -8 are out of the interval 2, -3.
    public static boolean numberInInterval(int firstNumber ,int lastNumber,int controlNumber){
        if(firstNumber<lastNumber) {
            return controlNumber > firstNumber && controlNumber < lastNumber;
        }
        return controlNumber<firstNumber&&controlNumber>lastNumber;
    }

    public static int elementsOutOfInterval(int[] arr){
        int countElements = 0;
        int firstNumber=arr[0];
        int lastNumber=arr[arr.length-1];

        for (int i = 0; i < arr.length; i++) {
            if(numberInInterval(firstNumber, lastNumber, arr[i]))
                countElements++;
        }
        return countElements;
    }
    //Print elements from right to left
    public static void elementsRightToLeft(int[] arr){
        System.out.println("Elements from right to left are: ");
        for (int i = arr.length-1; i >= 0;  i--) {
            System.out.print(arr[i] + " ");
        }
    }
    //Sum of the even values from array
    public static int evenValues(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0)
                sum += arr[i];
        }
        return sum;
    }
    
    //calculate the sum of values which are on odd positions on the array
    public static int sumOddPositions(int[] arr){
        int sumOfNumbersOddPositions = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 0)
                sumOfNumbersOddPositions += arr[i];
        }
        return sumOfNumbersOddPositions;
    }
    //calculate the sum which divide with 10
    public static int nrDividesWith10(int[] arr){
        int countNumbersWhichDivide = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%10 == 0)
                countNumbersWhichDivide++;
            
        }
        return countNumbersWhichDivide;
    }
    



}
