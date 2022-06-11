package br.com.xandecoelho5.bridge.mvc;

import br.com.xandecoelho5.bridge.mvc.dao.UserMongoDao;
import br.com.xandecoelho5.bridge.mvc.dao.UserMysqlDao;
import br.com.xandecoelho5.bridge.mvc.dao.UserOracleDao;
import br.com.xandecoelho5.bridge.mvc.dao.UserPostgresDao;
import br.com.xandecoelho5.bridge.mvc.model.User;
import br.com.xandecoelho5.bridge.mvc.services.UserEJB;
import br.com.xandecoelho5.bridge.mvc.services.UserRest;
import br.com.xandecoelho5.bridge.mvc.services.UserService;
import br.com.xandecoelho5.bridge.mvc.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");

		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);

		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);

		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);

		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);
	}
}
