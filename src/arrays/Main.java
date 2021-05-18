package arrays;
import static arrays.Arrays.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] array = {10, 11, 100, 999};
        //displayArray(array);
        System.out.println(sumArray(array));
        System.out.println(productArray(array));
        System.out.println(productEvenArray(array));
        System.out.println("Total nr. of even numbers. is " + evenNrArray(array));
        System.out.println("Max nr. is " + maxNrArray(array));
        System.out.println("Max even is " + maxEven(array));
        System.out.println("Sum of negative numbers is " + sumNegative(array));
        System.out.println("Prime numbers are " + primeNumbers(array));
    }
}
