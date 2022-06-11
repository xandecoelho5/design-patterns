package br.com.xandecoelho5.proxy.remoteResource;

import br.com.xandecoelho5.proxy.remoteResource.services.Resource;
import br.com.xandecoelho5.proxy.remoteResource.services.ResourceImpl;
import br.com.xandecoelho5.proxy.remoteResource.services.ResourceProxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Client {

	public static void main(String[] args) throws InterruptedException, IOException {
		Resource resource = new ResourceProxy("v@lid!");
//		Resource resource = new ResourceProxy("Inv@lid!");
//		Resource resource = new ResourceImpl();
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		boolean exit = false;
		do {
			System.out.print("""
					This is your options?:
					\t1-Current date
					\t...Other Options
					\t9-Get Resource's data
					\t0-Exit
					What do you want?\s""");
			String option = buffer.readLine();
			System.out.println("\n\n");
			switch (option) {
				case "1" -> System.out.println(new Date());
				case "9" -> System.out.println(resource.getData());
				case "0" -> exit = true;
				default -> System.out.println("Processing other options");
			}
			System.out.println("\n\n");
		} while (!exit);
		System.out.println("Bye!");
	}
}
