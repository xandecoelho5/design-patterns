package br.com.xandecoelho5.factory.dbadapter.factory;

import br.com.xandecoelho5.factory.dbadapter.db.DB;
import br.com.xandecoelho5.factory.dbadapter.db.PostgresDB;

public class PostgresFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new PostgresDB();
    }
}
