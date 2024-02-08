import java.util.Random;
import java.util.Scanner;

public class github_assignment {
    public static void main(String[] args) {
        displayMenu();
        System.out.println("Exiting system");
        System.out.println("Bye Bye!");   
    }

    static void displayMenu(){
        int choice;
        boolean exit = false;
        while(!exit){
            System.out.printf("Menu:%n");
            System.out.printf("%5s1- Find the minimum and maximum of the array%n", "");
            System.out.printf("%5s2- Find how much elements differ from average%n", "");
            System.out.printf("%5s3- Find the sum of odd and even indexes%n", "");
            System.out.printf("%5s4- EXIT%n", "");
            Scanner in = new Scanner(System.in);
            if(in.hasNextInt()){
                choice = in.nextInt();
                switch (choice)
                {
                    case 1:
                        //methods here
                        break; 
                    case 2:
                        //methods here
                        break;
                    case 3:
                        //methods here
                        break;
                    case 4:
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
}
