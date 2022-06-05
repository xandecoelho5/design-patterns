package br.com.xandecoelho5.factory.dbadapter.factory;

import br.com.xandecoelho5.factory.dbadapter.db.DB;
import br.com.xandecoelho5.factory.dbadapter.db.OracleDB;

public class OracleFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new OracleDB();
    }
}
