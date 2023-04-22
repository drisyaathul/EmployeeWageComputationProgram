package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeWageComputation implements EmployeeWage {
    /*
    * Creating arrayList instead of Array for many list of Companies to manage Employee
    * HashMap for company name is mapped with total company emp wage
     */
    public static ArrayList<CompanyEmpWage> companyEmpWages = new ArrayList<CompanyEmpWage>();
    public static HashMap<String, CompanyEmpWage> companyEmpWageHashMap = new HashMap<>();

    @Override
    public void ComputeEmpWage() {

    }
    // Creating companyEmpWage objects and add to the arraylist
    public void addCompanyEmpWage(String companyName, int wagePerHour, int workingDays, int max_workingHours) {

        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHour, workingDays, max_workingHours);
        companyEmpWages.add(companyEmpWage);
        companyEmpWageHashMap.put(companyName,companyEmpWage);
    }
    public void computeEmpWage() {

        for (int i=0; i<companyEmpWages.size(); i++) {
            CompanyEmpWage companyEmpWage= companyEmpWages.get(i);
            companyEmpWage.setTotalEmpWage(companyEmpWage.ComputeEmpWage());
        }
    }
    public int getTotalWage(String company) {

        return companyEmpWageHashMap.get(company).totalEmpWage;
    }
    public static void main(String[] args) {

        System.out.println("*** Welcome To EMPLOYEE WAGE COMPUTATION PROGRAM ***");
        System.out.println();
 /*
   Calling Method to get Total Employee Wage when queried by Company
 */
    EmployeeWageComputation obj = new EmployeeWageComputation();
    obj.addCompanyEmpWage("ABB", 50, 35, 100);
    obj.addCompanyEmpWage("TCS", 30, 30, 160);
    obj.addCompanyEmpWage("INFO PARK",20,24,120);
    obj.computeEmpWage();
    System.out.println("Employee of TCS Total Monthly Wage = "+obj.getTotalWage("TCS")+" $");

    }
}

