package io.codeforall.bootcamp;
import io.codeforall.bootcamp.exercise.Ai;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;
public class Playground {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        a = Ai.doubleArray(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Ai.factorialIterative(5));
        System.out.println(Ai.factorialRecursive(5));

        Ai ai = new Ai();
        Ai ai2 = new Ai();
        System.out.println(ai.getName() + " " + ai.getCreationDate());
        System.out.println(ai2.getName() + " " + ai.getCreationDate());

        ai.setName("King Julio");
        ai2.setCreationDate("1906-06-08");
        System.out.println("New name:" + " " + ai.getName() + " " + ai.getCreationDate());
        System.out.println("New creation date:" + " " + ai2.getName() + " " + ai2.getCreationDate());

        String inputStr = "one two madam three ofo four";
        System.out.println("Original string:" + inputStr);
        System.out.println("Palindromes Replaced: " + ai.palindromeReplace(inputStr));

    }
}