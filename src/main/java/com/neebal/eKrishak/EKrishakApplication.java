package com.neebal.eKrishak;

import com.neebal.eKrishak.exception.UserFoundException;
import com.neebal.eKrishak.model.Role;
import com.neebal.eKrishak.model.User;
import com.neebal.eKrishak.model.UserRole;
import com.neebal.eKrishak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class EKrishakApplication
		//implements CommandLineRunner
		{

	@Autowired
	private UserService userService;


	public static void main(String[] args) {
		SpringApplication.run(EKrishakApplication.class, args);
	}
//
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
//	@Override
//	public void run(String... args) throws Exception {
//		try {
//
//
//			System.out.println("starting code");
////
//			User user = new User();
//
//			user.setFirstName("shivam");
//			user.setLastName("vish");
//			user.setUsername("shivish20");
//			user.setPassword(this.bCryptPasswordEncoder.encode("abcdef"));
//			user.setEmail("abc@gmail.com");
//			user.setProfile("default.png");
//
//			Role role1 = new Role();
//			role1.setRoleId(44L);
//			role1.setRoleName("ADMIN");
//
//			Set<UserRole> userRoleSet = new HashSet<>();
//			UserRole userRole = new UserRole();
//
//			userRole.setRole(role1);
//
//			userRole.setUser(user);
//
//			userRoleSet.add(userRole);
//
//			User user1 = this.userService.createUser(user, userRoleSet);
//			System.out.println(user1.getUsername());
//
//
//		} catch (UserFoundException e) {
//			e.printStackTrace();
//

//		}

//	}

}
