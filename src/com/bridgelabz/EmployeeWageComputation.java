package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {

    private static final int wagePerHour = 20;
    private static final int workingDays = 20;   //given total working days in a month(UC5)
    private static final int max_workingHours = 100;   //given total working Hours in a month(UC6)

    public static void main(String[] args) {
        System.out.println("*** Welcome To EMPLOYEE WAGE COMPUTATION PROGRAM ***");

        int totalWage = 0;
        int dailyWage;
        int workingHour = 0;
        int totalWorkingHour = 0;
        int day = 1;

        while (day <= workingDays && workingHour <= max_workingHours) {
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
                    System.out.println("Employee is PART-TIME");
                    workingHour = 4;
                    break;
            }
            day ++;
            dailyWage = workingHour * wagePerHour;
            totalWage += dailyWage ;
            totalWorkingHour += workingHour;
            System.out.println("Employee Working Hour Per Day = "+workingHour);
            System.out.println("Employee Daily Wage = " + dailyWage);
        }
        System.out.println("**********************************************");
        System.out.println("Employee Monthly Wage = " + totalWage+ " $ ");

    }
}
