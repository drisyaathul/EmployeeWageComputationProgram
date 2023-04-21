package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {

    private static final int wagePerHour = 20;
    private static final int workingDays = 20;
    private static final int max_workingHours = 100;
    public void ComputeEmployeeWage(String companyName, int wagePerHour, int workingDays, int max_workingHours){

        System.out.println("Name of the Company : " +companyName);
        System.out.println("Company Wage per Hour : " +wagePerHour+ " $");
        System.out.println("Company Working Days : " +workingDays+ " Days");
        System.out.println("Company Maximum Working Hours : " +max_workingHours+ " Hrs");

        int totalWage = 0;
        int dailyWage;
        int workingHour = 0;
        int totalWorkingHour = 0;
        int day = 1;

        while (workingHour <= max_workingHours && day <= workingDays) {

            Random random = new Random();
            int attendance = random.nextInt(3);
            System.out.println();
            System.out.println("DAY => "+day+ ";");
            switch (attendance) {
                case 0:
                    System.out.println("Employee is ABSENT");
                    workingHour = 0;
                    break;
                case 1:
                    System.out.println("Employee is PRESENT");
                    workingHour = 8;
                    break;
                default:
                    System.out.println("Employee is HALF-DAY");
                    workingHour = 4;
                    break;
            }
            day++;
            dailyWage = workingHour * wagePerHour;
            totalWage += dailyWage ;
            totalWorkingHour += workingHour;
            System.out.println("Employee Working Hour Per Day = "+workingHour);
            System.out.println("Employee Daily Wage = " + dailyWage);
        }
        System.out.println();
        System.out.println("Employee of " +companyName+ " Monthly Wage is " + totalWage+ " $ ");
        System.out.println("--------------------------------------");
    }
    public static void main(String[] args) {

        System.out.println("*** Welcome To EMPLOYEE WAGE COMPUTATION PROGRAM ***");

        EmployeeWageComputation company = new EmployeeWageComputation();
        company.ComputeEmployeeWage("ABB", 50, 25, 100);
        company.ComputeEmployeeWage("TCS", 30, 20, 160);
        company.ComputeEmployeeWage("INFO PARK", 20, 24, 120);
    }
}
