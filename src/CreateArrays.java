/*
This program will initialize and print arrays of various data types
1. import java.util.Arrays;
2. Set up variables for int, String, char, and boolean
3. Set the size of the arrays
4. Fill in the arrays
5. Print out the arrays using Arrays.toString()
 */

import java.util.Arrays;

public class CreateArrays {
    public static void main (String[] args) {
        /*
        Arrays can be filled in as they're instantiated or after by specifying the index
         */
        int[] numbers = {1, 21, 63, 4, 51};
        String[] words = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        char[] characters = new char[5];
        characters[0] = 'a';
        characters[1] = 'e';
        characters[2] = 'i';
        characters[3] = 'o';
        characters[4] = 'u';
        boolean[] trueFalse = {true, false};

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(characters));
        System.out.println(Arrays.toString(trueFalse));
    }
}
