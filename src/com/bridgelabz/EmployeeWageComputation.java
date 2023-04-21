package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {

    public static final int wagePerHour = 20;
    public static final int workingDays = 20;
    public static final int max_workingHours = 100;
/*
    Used the EmployeeWage() Method to Compute the Attendance (UC7)
*/
    public void EmployeeWage(){
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
        System.out.println("**********************************************");
        System.out.println("Employee Monthly Wage = " + totalWage+ " $ ");
    }
    public static void main(String[] args) {

        System.out.println("*** Welcome To EMPLOYEE WAGE COMPUTATION PROGRAM ***");
    /*
        Create class method to compute Employee wage And calling the object compute Employee wage
        in the main method
    */
        EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
        employeeWageComputation.EmployeeWage();
    }
}
