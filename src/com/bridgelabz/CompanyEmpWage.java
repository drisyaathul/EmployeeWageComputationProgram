package com.bridgelabz;

import java.util.Random;

public class CompanyEmpWage implements EmployeeWage {
    /*
     Use Instance Variable instead of function parameters(UC9)
    */
    private final String companyName;
    private int wagePerHour;
    private int workingDays;
    private int max_workingHours;
    /*
    Generating Constructors
     */
    public CompanyEmpWage(String companyName, int wagePerHour, int workingDays, int max_workingHours) {
        this.companyName =companyName;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.max_workingHours = max_workingHours;
    }
    public int ComputeEmpWage(){
        //variables
        int totalWage = 0;
        int dailyWage;
        int workingHour = 0;
        int totalWorkingHour = 0;
        int day = 1;
        //computation
        while (workingHour <= max_workingHours && day <= workingDays){
            /*
             * Attendance to check the employee is full tym work or part tym or Absent
             * We use the switch case For Attendance
             */
            Random random = new Random();
            int attendance = random.nextInt(3);
            switch (attendance) {
                case 0:
                    // ABSENT
                    workingHour = 0;
                    break;
                case 1:
                    //PRESENT
                    workingHour = 8;
                    break;
                default:
                    //HALF-DAY
                    workingHour = 4;
                    break;
            }
 /*
   calculating the Employee wage
 * Calculating daily Wage = Working hrs multiply by Wage Per Hrs
 * Calculating Total Wage = Daily Wage
 * Calculating  Total working hrs  = Max Working hrs
  */
            day++;
            dailyWage = workingHour * wagePerHour;
            totalWage += dailyWage ;
            totalWorkingHour += workingHour;
        }
        return totalWage;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "companyName='" + companyName + '\'' +
                ", wagePerHour=" + wagePerHour +
                ", workingDays=" + workingDays +
                ", max_workingHours=" + max_workingHours +
                '}';
    }
}


