package cp;

import java.sql.Connection;

public interface ConnectionPool {
	
	void init() throws Exception;
	void destroy() throws Exception;
	
	Connection take() throws Exception;
	boolean bringBack(Connection con) throws Exception;

}
