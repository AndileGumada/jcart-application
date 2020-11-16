package com.andile.jcart;

import static org.junit.Assert.*;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest( classes = JCartCoreApplication.class)
public class JCartCoreApplicationTest {

	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testDummy() throws SQLException {
		String  schema = dataSource.getConnection().getCatalog();
		assertEquals("jcart",schema);
	}
}
