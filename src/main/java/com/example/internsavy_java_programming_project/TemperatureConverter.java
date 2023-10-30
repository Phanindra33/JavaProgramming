package com.example.internsavy_java_programming_project;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Quit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = convertFahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius");
            } else if (choice == 2) {
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = convertCelsiusToFahrenheit(celsius);
                System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
