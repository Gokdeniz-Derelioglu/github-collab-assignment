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
}
