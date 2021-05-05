package com.kaytv;

import java.util.Scanner;

public class ChallengeTwo {

    public static void announceTeaTime() {
        System.out.println("Waiting for tea time...");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Its tea time!");
    }

    public static double calculateMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tax + tip;
        return result;
    }

    public static double salaryCalculator(double hours, double wage, double vacationDays) {
        double vacationHours = vacationDays * 8;
        double hoursWorked = hours - vacationHours;
        double salary = hoursWorked * wage;
        return salary;
    }

    public static void main(String[] args) {
        double salary = salaryCalculator(340, 14.00, 2);
        System.out.println(salary);
    }
}
