package com.wallet.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wallet.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
	
	private static final String EMAIL = "email@teste.com";
	
	@Autowired
	UserRepository repository;
	
	@Before
	public void setUp() {
		
		User aUser = new User();
		aUser.setName("Set up user");
		aUser.setPassword("Senha123");
		aUser.setEmail(EMAIL);
		
		repository.save(aUser);
		
	}
	
	
	@After
	public void tearDown() {
		repository.deleteAll();
	}
	
	@Test
	public void testSave() {
		User aUser = new User();
		aUser.setName("Teste");
		aUser.setPassword("123456");
		aUser.setEmail("teste@teste.com");
		
		User response = repository.save(aUser);
		
		assertNotNull(response);
	}
	
	@Test
	public void testFindByEmail() {
		Optional<User> response = repository.findByEmailEquals(EMAIL);
		
		assertTrue(response.isPresent());
		assertEquals(response.get().getEmail(), EMAIL);
	}
	
}
