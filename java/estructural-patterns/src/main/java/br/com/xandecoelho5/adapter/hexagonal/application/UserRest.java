package br.com.xandecoelho5.adapter.hexagonal.application;

import br.com.xandecoelho5.adapter.hexagonal.core.model.User;
import br.com.xandecoelho5.adapter.hexagonal.core.usecases.UserService;
import br.com.xandecoelho5.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

import java.util.List;
import java.util.Map;

public class UserRest {

    private final UserService userService;

    public UserRest() {
        UserMemoryDatabaseAdapter databaseAdapter = new UserMemoryDatabaseAdapter();
        userService = new UserService(databaseAdapter);
    }

    public Integer post(Map<String, String> values) {
        User user = new User(values.get("name"), values.get("email"), values.get("password"));
        User savedUser = userService.save(user);
        System.out.println(savedUser + " saved in memory!");

        return 201;
    }

    public Integer get() {
        var users = userService.getAll();
		System.out.println("Current users in database:");
        users.forEach(System.out::println);

        return 200;
    }
}
