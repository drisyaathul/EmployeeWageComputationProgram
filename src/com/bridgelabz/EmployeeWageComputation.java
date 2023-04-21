package com.bridgelabz;

import java.util.ArrayList;

public class EmployeeWageComputation {
      //To create arrayList instead of Array for many list of Companies to manage Employee
    public static ArrayList<CompanyEmpWage> companyEmpWages = new ArrayList<CompanyEmpWage>();

    public static void main(String[] args) {

        System.out.println("*** Welcome To EMPLOYEE WAGE COMPUTATION PROGRAM ***");
        System.out.println();
 /*
   Calling Method Using ArrayList
 */
        companyEmpWages.add(new CompanyEmpWage("ABB",50,25,100));
        int empWageAbb = companyEmpWages.get(0).ComputeEmpWage();
        System.out.println("Employee of ABB Monthly Wage is " +empWageAbb+ " $ ");
        System.out.println("----------------------------------------------------");
        companyEmpWages.add(new CompanyEmpWage("TCS",30,30,160));
        int empWageTcs = companyEmpWages.get(0).ComputeEmpWage();
        System.out.println("Employee of TCS Monthly Wage is " +empWageTcs+ " $ ");
        System.out.println("----------------------------------------------------");
        companyEmpWages.add(new CompanyEmpWage("INFO-PARK",20,24,120));
        int empWageInfoPark = companyEmpWages.get(0).ComputeEmpWage();
        System.out.println("Employee of INFO-PARK Monthly Wage is " +empWageInfoPark+ " $ ");
    }
}

