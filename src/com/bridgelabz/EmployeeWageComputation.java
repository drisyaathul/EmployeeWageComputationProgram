package com.bridgelabz;

public class EmployeeWageComputation {
    /*
    To create array of many CompanyEmpWage Object
     */
    public static CompanyEmpWage objectArray[] = new CompanyEmpWage[3];

    public static void main(String[] args) {

        System.out.println("*** Welcome To EMPLOYEE WAGE COMPUTATION PROGRAM ***");
        System.out.println();
 /*
   Create class method to compute Employee wage And calling the object of Company Employee wage in the main method
 */
        objectArray[0] = new CompanyEmpWage("ABB",50,25,100);
        int empWageAbb = objectArray[0].ComputeEmpWage();
        System.out.println(objectArray[0]);
        System.out.println("Employee of ABB Monthly Wage is " +empWageAbb+ " $ ");

        objectArray[1] = new CompanyEmpWage("TCS",30,30,160);
        int empWageTcs = objectArray[1].ComputeEmpWage();
        System.out.println(objectArray[1]);
        System.out.println("Employee of TCS Monthly Wage is " +empWageTcs+ " $ ");

        objectArray[2] = new CompanyEmpWage("INFO PARK",20,24,120);
        int empWageInfoPark = objectArray[2].ComputeEmpWage();
        System.out.println(objectArray[2]);
        System.out.println("Employee of INFO PARK Monthly Wage is " +empWageInfoPark+ " $ ");

    }
}
