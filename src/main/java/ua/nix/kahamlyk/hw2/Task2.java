package ua.nix.kahamlyk.hw2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String value = scanner.next();

        System.out.println(EnteringOfSymbols.AmountOfEnterings(value));

    }

}
