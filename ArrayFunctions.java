import java.util.*;

class ArrayFunctions{

    // Method to display an ArrayList
    public void display(ArrayList<Integer> array) {
        System.out.println("Array is :" + array);
    }

    // Method to separate even and odd numbers from an array
    public void oddEven(int[] arr) {

        ArrayList<Integer> even = new ArrayList<Integer>(); // List to store even numbers
        ArrayList<Integer> odd = new ArrayList<Integer>(); // List to store odd numbers

        // Loop to iterate through the array and separate even and odd numbers
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) { // Checking if the number is even
                even.add(arr[i]); // Adding even number to the even list
            } else { 
                odd.add(arr[i]); // Adding odd number to the odd list
            }
        }

        // Displaying the separated even and odd numbers
        System.out.println("Array of Odd numbers is :" + odd);
        System.out.println("Array of Even Numbers is :" + even);
    }

    // Method to find the minimum difference between consecutive elements in the array
    public void minimumDifference(int[] arr) {
        int i = 0;
        int min = arr[i] - arr[i+1]; // Initializing min with the difference of first two elements
        int x = 0; // Variable to store the index of the minimum difference

        // Loop to find the smallest difference between consecutive elements
        for(i = 1; i < (arr.length - 1); i++) {
            int dif = arr[i] - arr[i+1]; // Calculating difference between consecutive elements
            if(min > dif) { // Checking if the new difference is smaller
                min = dif; // Updating min with the new smallest difference
                x = i; // Storing the index where min difference occurs
            } 
        }
        // Displaying the minimum difference and its index
        System.out.println("The Minimum Difference is " + min + " and the index is " + x);
    }
}
