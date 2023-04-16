package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("*** Welcome To EMPLOYEE WAGE COMPUTATION PROGRAM ***");

        Random random = new Random();
        int attendance = random.nextInt(3);
        if (attendance == 0)
            System.out.println("Employee is ABSENT");
        else if (attendance == 1)
            System.out.println("Employee is PRESENT");
        else
            System.out.println("Employee is PART-TIME");      //UC3

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;   //UC3
        int dailyWage;
        int partTimeWage;

        dailyWage = attendance * wagePerHour * fullDayHour;
        partTimeWage = wagePerHour * partTimeHour;     //UC3

        if (attendance == 0)
            System.out.println("Employee Wage Per Day = "+dailyWage);
        else if (attendance == 1)
            System.out.println("Employee Wage Per Day = "+dailyWage);
        else
            System.out.println("Employee Part Time Wage  = "+partTimeWage);     //UC3

    }
}
