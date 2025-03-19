package com.example;

import java.util.Scanner;

public class Main {
    public static String processInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "Invalid input";
        }
        return "Hello, " + input + "!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println(processInput(name));
        scanner.close();
    }
}
