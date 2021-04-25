package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositiveNumber {


    public int getFirstMissingPositiveNumber(Integer [] array){

        // sort array
        Arrays.sort(array);

        // eliminate duplicate values
        Set<Integer> uniqueValues = new HashSet<>(Arrays.asList(array));

        // initialize an array with uniqueValues' size
        Integer[] newArray = new Integer[uniqueValues.size()];

        // populate the newArray with the uniqueValue values
        uniqueValues.toArray(newArray);

        // init result
        int result = 0;

        // loop through the the newArray
        for (int index = 0; index < newArray.length; index++){

                // check if the value(index) does not exist in the array && the index is greater than 0
                if (!contains(index, newArray) && index > 0){
                    result = index;
                    break;
                }

                // check if the value(index) exist in the array && is the last, the adds one
                if(contains(index, newArray) && (index == newArray.length-1)) {
                    result = newArray[index] + 1;
                    break;
                }
        }

        // return the result
        return result;
    }

    private boolean contains(int index, Integer[] array) {

        // loop through the array
        for (int i = 0; i < array.length; i++) {

            // check if the vale(index) is in the array
            if (array[i] == index) {
                // returns true if it does
                return true;
            }
        }

        // returns false if it doesn't
            return false;
    }
}
