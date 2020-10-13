package com.employeeWageforMultipleCompanies;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageforMultipleCompanies {

	static double wagePerHour;
	static int fullDayHours;
	static int partTimeHours;
	static int numberofWorkingDays;
	static int maxHoursInMonth;

	static int totalEmpHrs = 0;
	static int empHrs = 0;
	static int totalWorkingDays = 0;
	static double monthly_Wage = 0;
	static double daily_Wage = 0;

	public static void monthlywagewithcondition(double wagePerHour, int fullDayHours, int partTimeHours,
			int numberofWorkingDays, int maxHoursInMonth) {

		Random rand = new Random();

		while (totalEmpHrs != maxHoursInMonth && totalWorkingDays != numberofWorkingDays) {
			totalWorkingDays++;

			int random = rand.nextInt(3);

			switch (random) {

			case 1:
				empHrs = fullDayHours;
				break;

			case 2:
				empHrs = partTimeHours;
				break;

			case 0:
				empHrs = 0;
				break;

			}

			totalEmpHrs = totalEmpHrs + empHrs;
			
		}

		monthly_Wage = totalEmpHrs * wagePerHour;
		System.out.println("total hours= "+totalEmpHrs+"    "+"total days= "+totalWorkingDays);
		System.out.println("Monthly Wage : " + monthly_Wage);

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter WAGE_PER_HR, FULL_DAY_HRS, PART_TIME_HRS, NUM_OF_WORKING_DAYS, MAX_HRS_IN_MONTH");

		wagePerHour = scanner.nextDouble();
		fullDayHours = scanner.nextInt();
		partTimeHours = scanner.nextInt();
		numberofWorkingDays = scanner.nextInt();
		maxHoursInMonth = scanner.nextInt();

		EmployeeWageforMultipleCompanies.monthlywagewithcondition(wagePerHour, fullDayHours, partTimeHours,
				numberofWorkingDays, maxHoursInMonth);

		scanner.close();

	}

}
