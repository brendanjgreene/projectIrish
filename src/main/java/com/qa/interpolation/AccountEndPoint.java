package com.qa.interpolation;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.service.AccountService;
import com.qa.service.repository.AccountDBRepository;

@Path("/account")
public class AccountEndPoint {
	
	///comment to check git hub
	
	private static final Logger LOGGER = Logger.getLogger(AccountEndPoint.class);

	@Inject
	private AccountDBRepository repo;

	@Path("/json")
	@GET
	@Produces({ "application/json" })
	public String getAllAccounts() {
		LOGGER.info("AccountEndpoint getAllAccounts");
		return repo.getAllAccounts();
	}

	@Path("/json")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String account) {
		LOGGER.info("AccountEndpoint addAccount the value of account is " + account);
		return repo.createAccount(account);
	}

	@Path("/json/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateAccount(@PathParam("id") Long id, String account) {
		LOGGER.info("AccountEndpoint updateAccount the value of account is " + id);
		return repo.updateAccount(id, account);
	}

	@Path("/json/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") Long id) {
		LOGGER.info("AccountEndpoint deleteAccount the value of account is " + id);
		return repo.deleteAccount(id);

	}

	public void setRepo(AccountDBRepository repo) {
		this.repo = repo;
	}

}
