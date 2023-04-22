package com.bridgelabz;

public interface EmployeeWage {
    public void ComputeEmpWage();
    public void addCompanyEmpWage(String companyName, int wagePerHour, int workingDays, int max_workingHours);
    public int getTotalWage(String company);
}
