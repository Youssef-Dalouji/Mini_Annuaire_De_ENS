package dao;

import static org.junit.Assert.*;

import java.sql.*;

import org.junit.Before;
import org.junit.Test;

public class TestDBConnection {
	private Connection connection;
	@Before
	public void setUp() throws Exception {
		connection=SingletonConnection.getConnection();
	}

	@Test
	public void testGetConnection() {
		assertNotNull("Connection object should not be null", connection);
	}

}
