package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositiveNumber {


    public int getFirstMissingPositiveNumber(Integer [] array){
        Set<Integer> myNumber = new HashSet<>(Arrays.asList(array));
        Integer[] sortedArray = new Integer[myNumber.size()];
        myNumber.toArray(sortedArray);
        Arrays.sort(sortedArray);

        int firstMissingPositiveNumber = 0;

        for (int index = 0; index < sortedArray.length; index++){

            if(sortedArray[index] != index){

                    if (!contains(index, sortedArray) && index > 0){
                        firstMissingPositiveNumber = index;
                        break;
                    }

                    if(contains(index, sortedArray) && (index == sortedArray.length-1)) {
                        firstMissingPositiveNumber = sortedArray[index] + 1;
                        break;
                    }
            }
        }

        return firstMissingPositiveNumber;
    }

    private boolean contains(int index, Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                return true;
            }
        }
            return false;
    }
}
