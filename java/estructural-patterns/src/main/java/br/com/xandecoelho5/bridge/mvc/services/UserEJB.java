package br.com.xandecoelho5.bridge.mvc.services;

import br.com.xandecoelho5.bridge.mvc.dao.UserDao;
import br.com.xandecoelho5.bridge.mvc.model.User;

public class UserEJB extends UserService {

	public UserEJB(UserDao userDao) {
		super(userDao);
	}

	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
		userDao.save(user);
	}
}
