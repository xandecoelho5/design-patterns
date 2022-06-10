package br.com.xandecoelho5.adapter.hexagonal.core.usecases;

import br.com.xandecoelho5.adapter.hexagonal.core.model.User;
import br.com.xandecoelho5.adapter.hexagonal.core.ports.UserRepository;

import java.util.List;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.getAll();
    }
}
