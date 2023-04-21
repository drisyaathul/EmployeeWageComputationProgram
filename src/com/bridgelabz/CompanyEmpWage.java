package com.bridgelabz;

import java.util.ArrayList;
import java.util.Random;

public class CompanyEmpWage {
/*
 Use Instance Variable instead of function parameters(UC9)
*/
    private final String companyName;
    private final int wagePerHour ;
    private final int workingDays ;
    private final int max_workingHours ;
/*
Generating Constructors
 */
    public CompanyEmpWage(String companyName, int wagePerHour, int workingDays, int max_workingHours) {
        this.companyName =companyName;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.max_workingHours = max_workingHours;
    }
    public void ComputeEmpWage(){
    //variables
        int totalWage = 0;
        int dailyWage;
        int workingHour;
        int totalWorkingHour = 0;
    //computation
        for (int day = 1; day <= workingDays; day++) {
/*
 * Attendance to check the employee is full tym work or part tym or Absent
 * We use the switch case For Attendance
 */
            Random random = new Random();
            int attendance = random.nextInt(3);
            //System.out.println("DAY => "+day+ ";");
            switch (attendance) {
                case 0:
                    //System.out.println("Employee is ABSENT");
                    workingHour = 0;
                    break;
                case 1:
                    //System.out.println("Employee is PRESENT");
                    workingHour = 8;
                    break;
                default:
                    //System.out.println("Employee is HALF-DAY");
                    workingHour = 4;
                    break;
            }
 /*
   calculating the Employee wage
 * Calculating daily Wage = Working hrs multiply by Wage Per Hrs
 * Calculating Total Wage = Daily Wage
 * Calculating  Total working hrs  = Max Working hrs
  */
            dailyWage = workingHour * wagePerHour;
            totalWage += dailyWage ;
            totalWorkingHour += workingHour;
//            System.out.println("Employee Working Hour Per Day = "+workingHour);
//            System.out.println("Employee Daily Wage = " + dailyWage);
        }
        System.out.println("Employee of "+companyName+" Monthly Wage is " + totalWage+ " $ ");
        System.out.println("--------------------------------------------------------------");
    }
    @Override
    public String toString() {
        return "EmpWageBuilder{" +
                "companyName='" + companyName + '\'' +
                ", wagePerHour=" + wagePerHour +
                ", workingDays=" + workingDays +
                ", max_workingHours=" + max_workingHours +
                '}';
    }
}

