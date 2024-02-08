import java.util.Random;

public class github_assignment {
    public static void main(String[] args) {
        
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
        for(int i = 0; i<= arraySize; i++)
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
    private static double[] differenceCalculator (double[] array)
    {
        int size = array.length;
        double sum = 0;
        double average;
        double[] diffArray = new int[array.length];

        for (double element : array)
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
}
