package br.com.xandecoelho5.prototype.deepShallow;

import br.com.xandecoelho5.prototype.deepShallow.model.Address;
import br.com.xandecoelho5.prototype.deepShallow.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("Clone", 25, new Address("ABC Street", 1000));
		System.out.println(user);
		
		User cloneUser = user.clone();
		cloneUser.name = "Clone x2";
		cloneUser.address.street = "Double Street";
		System.out.println(user);
		System.out.println(cloneUser);
	}
}
