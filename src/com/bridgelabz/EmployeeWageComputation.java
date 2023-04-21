package com.bridgelabz;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("*** Welcome To EMPLOYEE WAGE COMPUTATION PROGRAM ***");
        System.out.println();
 /*
   Create class method to compute Employee wage And calling the object of Company Employee wage in the main method
 */
        CompanyEmpWage abb = new CompanyEmpWage("ABB",50,25,100);
        System.out.println(abb);
        abb.ComputeEmpWage();
        CompanyEmpWage tcs = new CompanyEmpWage("TCS",30,30,160);
        System.out.println(tcs);
        tcs.ComputeEmpWage();
        CompanyEmpWage infoPark = new CompanyEmpWage("INFO PARK",20,24,120);
        System.out.println(infoPark);
        infoPark.ComputeEmpWage();
    }
}
