package main;

public class FibonacciSeries {
    public static void main(String args[]) {

        int n1 = 0; //Initialize first variable
        int n2 = 1; // Initialize second variable
        int n3, i; // Declare other needed variable
        int count = 50; // Initialize the total number of times the loop will run and generate the series

        System.out.print(n1 + " " + n2);

        for(i=2; i<count; i++) {

            n3 = n1 + n2; // Add the first two initialize variable to get the third one

            System.out.print(" "+n3);

            n1 = n2; // Change the value of n1 to n2

            n2 = n3; // Change the value of n2 to n3
        }

        // The loop run according to the number of times declared in the variable count and generates the fibonacci series as the values in the variable changes

    }
}
