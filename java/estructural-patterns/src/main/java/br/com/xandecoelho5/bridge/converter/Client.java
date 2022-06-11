package br.com.xandecoelho5.bridge.converter;

import br.com.xandecoelho5.bridge.converter.converters.CSVConverter;
import br.com.xandecoelho5.bridge.converter.converters.JsonConverter;
import br.com.xandecoelho5.bridge.converter.employees.ITGuy;
import br.com.xandecoelho5.bridge.converter.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {
		CSVConverter csvConverter = new CSVConverter();
		JsonConverter jsonConverter = new JsonConverter();

		ITGuy itGuy = new ITGuy("Xandzera", 25, 6000.0);
		ProjectManager projectManager = new ProjectManager("Simper", 40, 12000.0);

		System.out.println(csvConverter.getEmployeeFormated(itGuy));
		System.out.println(jsonConverter.getEmployeeFormated(itGuy));
		System.out.println(csvConverter.getEmployeeFormated(projectManager));
		System.out.println(jsonConverter.getEmployeeFormated(projectManager));
	}
}
