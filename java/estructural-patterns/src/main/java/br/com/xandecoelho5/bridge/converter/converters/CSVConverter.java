package br.com.xandecoelho5.bridge.converter.converters;

import br.com.xandecoelho5.bridge.converter.employees.Employee;

public class CSVConverter {

	public String getEmployeeFormated(Employee emp) {
		return String.format("%s;%d;%.2f", 
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
