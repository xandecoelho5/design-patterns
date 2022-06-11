package br.com.xandecoelho5.bridge.mvc.services;

import br.com.xandecoelho5.bridge.mvc.dao.UserDao;
import br.com.xandecoelho5.bridge.mvc.model.User;

public abstract class UserService {

    protected final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public abstract void save(User user);
}
