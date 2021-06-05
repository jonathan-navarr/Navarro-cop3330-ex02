package oop.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class CountingCharacters {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("What is the input string?");
        String word = scnr.nextLine();
        int characterCount = word.length();
        System.out.println( word +" has " + characterCount +" characters");

    }
}
