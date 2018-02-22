package com.qa.interpolation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.qa.service.repository.AccountDBRepository;

public class AccountEndpointTest {

	@InjectMocks
	private AccountEndPoint endpoint;
	
	@Mock
	private AccountDBRepository repo;

	@Before
	public void setUp() throws Exception {
		//
		endpoint.setRepo(repo);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAllAccounts() {
		
		//fail("Not yet implemented");
	}

}
