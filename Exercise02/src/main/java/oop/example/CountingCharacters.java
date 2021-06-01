package oop.example;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("What is the input string?");
        String word = scnr.nextLine();
        int characterCount = word.length();
        System.out.println( word +" has " + characterCount +" characters");

    }
}
