package br.com.xandecoelho5.bridge.converter.converters;

import br.com.xandecoelho5.bridge.converter.employees.Employee;

public class JsonConverter {

	public String getEmployeeFormated(Employee emp) {
		return "{\n" +
				"\t\"name\": \"" + emp.getName() + "\",\n" +
				"\t\"age\": \"" + emp.getAge() + "\",\n" +
				"\t\"salary\": \"" + emp.getSalary() + "\"\n" +
				"}";
	}

}
