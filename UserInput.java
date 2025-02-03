import java.util.*;

class UserInput{

    // Method to take user input and return an array of integers
    int[] arrayInput() {

        int[] arr = new int[5]; // Creating an array to store 5 integers
        Scanner scan = new Scanner(System.in); // Scanner object to read user input
        System.out.println("Enter 5 numbers : "); // Prompting user for input

        // Loop to take 5 integer inputs from the user
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt(); // Storing user input in the array
        }
        return arr; // Returning the input array
    }
    
}
