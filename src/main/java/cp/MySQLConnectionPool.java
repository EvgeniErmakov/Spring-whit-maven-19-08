package cp;

import java.sql.Connection;

public class MySQLConnectionPool implements ConnectionPool {

	@Override
	public void init() throws Exception {
		// stub
		System.out.println("void init()");
		
	}

	@Override
	public void destroy() throws Exception {
		// stub
		System.out.println("void destroy()");
		
	}

	@Override
	public Connection take() throws Exception {
		// stub
		System.out.println("Connection take()");
		return null;
	}

	@Override
	public boolean bringBack(Connection con) throws Exception {
		// stub
		System.out.println("boolean bringBack(Connection con)");
		return false;
	}

}
