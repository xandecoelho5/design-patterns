package br.com.xandecoelho5.adapter.hexagonal;

import br.com.xandecoelho5.adapter.hexagonal.application.UserRest;

import java.util.HashMap;
import java.util.Map;

public class Client {

	public static void main(String[] args) {
		UserRest userRestApi = new UserRest();
		Map<String, String> body = new HashMap<>();
		body.put("email", "user1@email.com");
		body.put("name", "User 1");
		body.put("password", "passwd");
		Integer statusCode = userRestApi.post(body);
		System.out.println(statusCode);

		body.put("email", "user2@email.com");
		body.put("name", "User 2");
		statusCode = userRestApi.post(body);
		System.out.println(statusCode);

		statusCode = userRestApi.get();
		System.out.println(statusCode);
	}
}
