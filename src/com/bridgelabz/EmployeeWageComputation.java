package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("*** Welcome To EMPLOYEE WAGE COMPUTATION PROGRAM ***");
//UC1
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1)
            System.out.println("Employee is PRESENT");
        else
            System.out.println("Employee is ABSENT");
//UC2
        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage;

        dailyWage = attendance * wagePerHour * fullDayHour;
        if (attendance == 1)
            System.out.println("Employee Wage Per Day = "+dailyWage);
        else
            System.out.println("Employee Wage Per Day = "+dailyWage);

    }
}
