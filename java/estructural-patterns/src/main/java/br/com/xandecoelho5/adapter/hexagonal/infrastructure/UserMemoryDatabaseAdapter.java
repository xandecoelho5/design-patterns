package br.com.xandecoelho5.adapter.hexagonal.infrastructure;

import br.com.xandecoelho5.adapter.hexagonal.core.model.User;
import br.com.xandecoelho5.adapter.hexagonal.core.ports.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserMemoryDatabaseAdapter implements UserRepository {

    private final List<User> memoryUsers = new ArrayList<>();
    @Override
    public User save(User user) {
        memoryUsers.add(user);
        return user;
    }

    @Override
    public List<User> getAll() {
        return memoryUsers;
    }
}
