package br.com.xandecoelho5.adapter.hexagonal.core.ports;

import br.com.xandecoelho5.adapter.hexagonal.core.model.User;

import java.util.List;

public interface UserRepository {

	User save(User user);
    List<User> getAll();
}
