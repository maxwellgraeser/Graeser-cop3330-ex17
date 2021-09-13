/*
 *  UCF COP3330 Fall 2021 Exercise 17 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class BAC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gender;
        float ounces;
        float weight;
        float hours;

        System.out.print("Enter 1 if male, 2 if female: ");
        try {
            gender = Integer.parseInt(scan.nextLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Not a valid input, please enter numerics");
            return;
        }

        System.out.print("How many ounces of alcohol did you have? ");
        try {
            ounces = Float.parseFloat(scan.nextLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Not a valid input, please enter numerics");
            return;
        }

        System.out.print("What is your weight, in pounds? ");
        try {
            weight = Float.parseFloat(scan.nextLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Not a valid input, please enter numerics");
            return;
        }

        System.out.print("How many hours has it been since your last drink? ");
        try {
            hours = Float.parseFloat(scan.nextLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Not a valid input, please enter numerics");
            return;
        }
        double BAC = 1;
        if (gender == 1)
            BAC = (ounces * 5.14 / weight * 0.73) - (.015 * hours);
        else if (gender == 2)
            BAC = (ounces * 5.14 / weight * 0.66) - (.015 * hours);

        if (BAC < .08)
            System.out.println(String.format("Your BAC is %.6f\nIt is legal for you to drive", BAC));
        else
            System.out.println(String.format("Your BAC is %.6f\nIt is not legal for you to drive", BAC));
    }
}