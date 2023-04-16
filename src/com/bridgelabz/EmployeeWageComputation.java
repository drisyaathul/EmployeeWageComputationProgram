package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("*** Welcome To EMPLOYEE WAGE COMPUTATION PROGRAM ***");
        int wagePerHour = 20;
        int workingDays = 20;   //given total working days in a month(UC5)
        int monthlyWage;
        int dailyWage;
        int workingHour;
        Random random = new Random();
        int attendance = random.nextInt(3);
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
        dailyWage = workingHour * wagePerHour;
        monthlyWage = dailyWage * workingDays;
        System.out.println("Employee Daily Wage = " +dailyWage);
        System.out.println("Employee Monthly Wage = " +monthlyWage);
    }
}
