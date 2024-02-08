import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class github_assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arraySize = input.nextInt();
        int[] initialArray = createRandomArray(arraySize);
        displayMenu(initialArray);
        System.out.println("Exiting system");
        System.out.println("Bye Bye!");   
    }

    static void displayMenu(int[] array){
        int choice;
        boolean exit = false;
        while(!exit){
            System.out.printf("Menu:%n");
            System.out.printf("%5s1- Find the minimum and maximum of the array%n", "");
            System.out.printf("%5s2- Find how much elements differ from average%n", "");
            System.out.printf("%5s3- Find the sum of odd and even indexes%n", "");
            System.out.printf("%5s4- Find the average and the difference of the array");
            System.out.printf("%5s5- EXIT%n", "");
            Scanner in = new Scanner(System.in);
            if(in.hasNextInt()){
                choice = in.nextInt();
                switch (choice)
                {
                    case 1:
                        // finding maximum/minimum value method
                        System.out.println ("Maximum value of the array: " + findMaximum (array));
                        System.out.println ("Minimum value of the array: " + findMinimum (array));
                        break; 
                    case 2:
                        //methods here
                        break;
                    case 3:
                        //methods here
                        break;
                    case 4:
                        //differenceCalculator method
                        System.out.println(Arrays.toString(differenceCalculator(array)));
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("***Please enter a valid option***");
                        break;
                }
                    
            }
            else{
                System.out.println("***Please enter a valid option***");
            }
        }
    }

    /** 
     * This method creates an array of random numbers between (0,100)
     * @param arraySize, size of the array specified.
     * @return
     * Written by Gökdeniz Derelioğlu
     */
    private static int[] createRandomArray(int arraySize) {
        int x;
        Random random = new Random();
        int[] newArray = new int[arraySize]; 
        for(int i = 0; i < arraySize; i++)
        {
            x = random.nextInt(101);
            newArray[i] = x;
        }
        return newArray;
    }

    /**
     * This method calculates the average of an array and returns an array consisting the difference
     * of each element from the average, considering the element's indexes.
     * @param array
     * @return diffArray
     * @author Bora Balci
     */
    private static int[] differenceCalculator (int[] array)
    {
        int size = array.length;
        int sum = 0;
        int average;
        int[] diffArray = new int[array.length];

        for (int element : array)
        {
            sum = sum + element;
        }

        average = sum / size;

        for (int i = 0; i < diffArray.length; i++)
        {
            diffArray[i] = array[i] - average;
        }
        
        return diffArray;
    }

    /**
     * This method finds the number with the maximum value in a given array of integers.
     * @param numbers
     * @return max number
     *
     * @author Ceyhun Deniz Keleş
     */
    public static int findMaximum (int[] numbers)
    {
        int maxSoFar = numbers[0]; // Taking the number in the first index as the max at start

        for (int arrayIndex = 1; arrayIndex < numbers.length; arrayIndex++)
        {
            if (maxSoFar < numbers[arrayIndex])
            {
                maxSoFar = numbers[arrayIndex];
            }
        }

        return maxSoFar;
    }

    /**
     * This method finds the number with the minimum value in a given array of integers.
     * @param numbers
     * @return min number
     *
     * @author Ceyhun Deniz Keleş
     */
    public static int findMinimum (int[] numbers)
    {
        int minSoFar = numbers[0]; // Taking the number in the first index as the min at start

        for (int arrayIndex = 1; arrayIndex < numbers.length; arrayIndex++)
        {
            if (minSoFar > numbers[arrayIndex])
            {
                minSoFar = numbers[arrayIndex];
            }
        }

        return minSoFar;
    }
    /**
    * This method finds the sum of odd indexed numbers.
    * @param array
    * @return oddSum
    *
    * @author Erkam Uysal
    */
   public static int oddIndexedSum (int[] array) {
       int sum = 0;
       for(int i = 1; i < array.length; i+=2) {
           sum += array[i];
       }
       return sum;
   }

   /**
    * This method finds the sum of even indexed numbers.
    * @param array
    * @return evenSum
    *
    * @author Erkam Uysal
    */
   public static int evenIndexedSum (int[] array) {
       int sum = 0;
       for(int i = 0; i < array.length; i+=2) {
           sum += array[i];
       }
       return sum;
   }
}
