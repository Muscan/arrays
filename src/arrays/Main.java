package arrays;
import static arrays.Arrays.*;
public class Main {

    public static void main(String[] args) {

        int [] array = {10, 20, 330, 77, 12, 32, 56, 6, -1111, 66, 88, 99, 45, 24, 56778, 34534, 7890, -1231, 10};

        System.out.println("Sum of the array is: " + sumArray(array));
        System.out.println("Product of the array is: " + productArray(array));
        System.out.println("Product of the even numbers is: " + productEvenArray(array));
        System.out.println("Total nr. of even numbers. is: " + evenNrArray(array));
        System.out.println("Max nr. is: " + maxNrArray(array));
        System.out.println("Max even is: " + maxEven(array));
        System.out.println("Sum of negative numbers is: " + sumNegative(array));
        System.out.println("Prime numbers are: " + primeNumbers(array));
        System.out.println("Nr. of even values " + nrValEven(array) + " and the nr. of odd values: " + nrValOdd(array));
        System.out.println("Absolut value of even minus odd numbers is: " + absValue(array));
        System.out.println("Multiples of the last element are: " + multiplesLastElement(array));
        pairsOfArray(array);
        minMaxValuesOfArray(array);
        System.out.println("Sum of even elements is: "+sumEvenElements(array));
    }
}
