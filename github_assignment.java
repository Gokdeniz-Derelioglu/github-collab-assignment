import java.util.Random;

public class github_assignment {
    public static void main(String[] args) {
        double[] array = {1,2,3,4,5};
        System.out.println(differenceCalculator(array));
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
        double[] diffArray = new double[array.length];

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
}
