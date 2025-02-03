class Main {

    public static void main(String args[]) {
        UserInput in = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();

        int[] userArray = in.arrayInput(); // Get the input array once
        functions.minimumDifference(userArray); // Call minimumDifference function
        functions.oddEven(userArray); // Call oddEven function to display odd and even numbers
    }
}
