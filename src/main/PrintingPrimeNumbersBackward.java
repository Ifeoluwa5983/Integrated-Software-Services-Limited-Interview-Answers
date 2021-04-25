package main;

import java.util.ArrayList;

public class PrintingPrimeNumbersBackward {

        public static void main(String[] args) {

            int i = 0;
            int j = 0;
            ArrayList primeNumbers = new ArrayList(); //Initialize new arrayList

            for(i = 1000;i >= 1;i --) { // Initialize a for loop with the number of time it would run
                int counter = 0;
                for(j = i;j >= 1;j--) {
                    if(i % j == 0) { // if the value of i divide by itself equals to zero
                        counter = counter + 1; // It increments the counter
                    }
                }
                if(counter == 2) { // If the counter equals 2
                    primeNumbers.add(i); // It adds it to the array
                }
            }
            System.out.print("These are the prime numbers from 1-1000 :" + primeNumbers);
        }

    }

