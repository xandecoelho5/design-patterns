package br.com.xandecoelho5.factory.dbadapter;

import br.com.xandecoelho5.factory.dbadapter.db.DB;
import br.com.xandecoelho5.factory.dbadapter.factory.OracleFactory;
import br.com.xandecoelho5.factory.dbadapter.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {
		DB db = new OracleFactory().getDatabase();
		db.query("SELECT * FROM TABLE");
		db.update("UPDATE X SET X = 2");

		db = new PostgresFactory().getDatabase();
		db.query("SELECT * FROM TABLE");
		db.update("UPDATE X SET X = 2");
	}
}
