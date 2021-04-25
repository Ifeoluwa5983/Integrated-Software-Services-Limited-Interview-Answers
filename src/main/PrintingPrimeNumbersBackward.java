package main;

import java.util.ArrayList;

public class PrintingPrimeNumbersBackward {

        public static void main(String[] args) {

            int i = 0;
            int j = 0;
            ArrayList primeNumbers = new ArrayList();

            for(i = 1000;i >= 1;i --) {
                int counter = 0;
                for(j = i;j >= 1;j--) {
                    if(i % j == 0) {
                        counter = counter + 1;
                    }
                }
                if(counter == 2) {
                    primeNumbers.add(i);
                }
            }
            System.out.print("These are the prime numbers from 1-1000 :" + primeNumbers);
        }

    }

