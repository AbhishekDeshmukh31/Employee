package com.controller;

import com.dao.Dao;
import com.entity.Employee;

public class Controller {

	public static void main(String[] args) {

		Dao d = new Dao();
		Employee[] e = d.showAllEmployee();
		System.out.println("-------------------------");
		for (Employee emp : e) {
			System.out.println(emp);
		}

		d.EmpDetails();
		System.out.println("\n -	---------------------------------");
		d.showEmployeeRole("tester");
		System.out.println("\n ----------------------------------");
		System.out.println("Employee by id :" + d.showEmployeeById(1));
		System.out.println("\n ----------------------------------");
		Employee[] a = d.sortEmployeeAsc();
		for (Employee employee : a) {
			System.out.println(employee);

		}
		System.out.println("--------------------------");

		Employee[] b = d.sortEmployeeDsc();
		for (Employee employee : b) {
			System.out.println(employee);

		}
		System.out.println("\n ----------------------------------");
		Employee max = d.employeeMaxSalary();
		System.out.println("Employee with max sal :" + max);
		System.out.println("\n ----------------------------------");
		Employee min = d.employeeMinSalary();
		System.out.println("Employee with min sal :" + min);
		System.out.println("\n ----------------------------------");

	}
}