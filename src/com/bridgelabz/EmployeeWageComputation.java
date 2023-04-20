package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("*** Welcome To EMPLOYEE WAGE COMPUTATION PROGRAM ***");
        System.out.println();
 /*
   Create class method to compute Employee wage And calling the object of Employee wage Builder in the main method
 */
        EmpWageBuilder abb = new EmpWageBuilder("ABB",50,25,100);
        System.out.println(abb);
        abb.ComputeEmpWage();
        EmpWageBuilder tcs = new EmpWageBuilder("TCS",30,30,160);
        System.out.println(tcs);
        tcs.ComputeEmpWage();
        EmpWageBuilder infoPark = new EmpWageBuilder("INFO PARK",20,24,120);
        System.out.println(infoPark);
        infoPark.ComputeEmpWage();
    }
}
