package io.codeforall.bootcamp.exercise;
import java.time.LocalDate;
import java.util.UUID;

public class Ai {

    private String creationDate;
    private String name;

    public Ai() {
        this.creationDate = LocalDate.now().toString();
        this.name = UUID.randomUUID().toString().substring(0,6);
    }

    public Ai(String creationDate, String name){
        this.creationDate = creationDate;
        this.name = name;
    }

    public String getCreationDate(){
        return this.creationDate;
    }

    public String getName(){
        return  this.name;
    }

    public void setCreationDate(String date){
        this.creationDate = date;
    }

    public void setName(String name){
        this.name = name;
    }

    public static int[] doubleArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
        }
        return a;
    }

    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
    public static String palindromeReplace(String inputString) {
        String[] words = inputString.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (isPalindrome(word)) {
                result.append("palindrome ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }

    private static boolean isPalindrome(String word) {
        String cleanWord = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
        String reversedWord = new StringBuilder(cleanWord).reverse().toString();
        return cleanWord.equals(reversedWord);
    }
}
