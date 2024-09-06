package com.dao;

import com.entity.Employee;

public class Dao {
	Employee db;

	public Employee[] EmpDetails() {

		Employee[] db = new Employee[10];

		db[0] = new Employee(1, "Raj Patil", 75000, "Developer");
		db[1] = new Employee(3, "Neha Joshi", 48000, "Tester");
		db[2] = new Employee(7, "Raj Sharma", 48000, "Developer");
		db[3] = new Employee(2, "Akash Singh", 48000, "Developer");
		db[4] = new Employee(8, "Suraj Chaudhary", 48000, "Tester");
		db[5] = new Employee(10, "Sumit Iyer", 48000, "HR");
		db[6] = new Employee(5, "Arun Verma", 150000, "Administration");
		db[7] = new Employee(9, "Shivam Patel", 100000, "Tester");
		db[8] = new Employee(4, "Ramaswammy Ranganathan", 120000, "Team Leader");
		db[9] = new Employee(6, "Deepika Gupta", 90000, "CEO");

		return db;
	}

	public Employee[] showAllEmployee() {
		Employee[] emp = EmpDetails();

		return emp;

	}

	public Employee showEmployeeById(int id) {
		Employee[] emp = EmpDetails();
		int index = id - 1;
		return emp[index];

	}

	public Employee[] showEmployeeRole(String role) {
		Employee[] emp = EmpDetails();
		for (Employee e : emp) {
			if (e.getDept().equalsIgnoreCase(role)) {
				System.out.println(e);

			}
		}
		return emp;
	}

	public Employee employeeMaxSalary() {
		Employee[] emp = EmpDetails();
		Employee empmaxSal = emp[0];

		for (Employee employee : emp) {
			if (employee.getSal() > empmaxSal.getSal()) {
				empmaxSal = employee;
			}
		}
		return empmaxSal;
	}

	public Employee employeeMinSalary() {
		Employee[] emp = EmpDetails();
		Employee empminSal = emp[0];
		for (Employee employee : emp) {
			if (employee.getSal() < empminSal.getSal()) {
				empminSal = employee;
			}
		}
		return empminSal;
	}

	public Employee[] sortEmployeeAsc() {
		Employee[] emp = EmpDetails();
		int n = emp.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (emp[j].getEid() > emp[j + 1].getEid()) {
					Employee temp = emp[j];
					emp[j] = emp[j + 1];
					emp[j + 1] = temp;
				}
			}
		}
		return emp;
	}

	public Employee[] sortEmployeeDsc() {
		Employee[] emp = EmpDetails();
		int n = emp.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (emp[j].getEid() < emp[j + 1].getEid()) {
					Employee temp = emp[j];
					emp[j] = emp[j + 1];
					emp[j + 1] = temp;
				}
			}
		}
		return emp;
	}

}
