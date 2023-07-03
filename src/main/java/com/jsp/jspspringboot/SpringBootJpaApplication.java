package com.jsp.jspspringboot;


import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.context.ApplicationContext;

import com.jsp.jspspringboot.dao.UserRepository;
import com.jsp.jspspringboot.entity.User;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootJpaApplication.class, args);
		
		UserRepository userRepository= context.getBean(UserRepository.class);
		
//		User user=new User();
//		user.setName("Bhushan Pawase");
//		user.setCity("Mumbai");
//		user.setStatus("I am Java Developer");
		
		//Saving Single User
//		User user2= userRepository.save(user);
//	
//		System.out.println(user2);
		
		//Create object of User
//		User user1=new User();
//		user1.setName("Hrurik Pawase");
//		user1.setCity("Goa");
//		user1.setStatus("Python programmer");
//		
//		User user2=new User();
//		user2.setName("Dakshata Pawase");
//		user2.setCity("Delhi");
//		user2.setStatus("C# programmer");
//		
//		//Saving Multiple User
//		List<User> users= List.of(user1,user2);
//		Iterable<User> result= userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		
//		System.out.println("Done");
		
		
		
		//Update the USer ID 52
//		Optional<User> optional= userRepository.findById(52);
//		User user= optional.get();
//		
//		user.setCity("Ratnagiri");
//		
//		User result= userRepository.save(user);
//		
//		System.out.println(result);
		
		
		
		//How to get User
		//findAll()
//		Iterable<User> itr= userRepository.findAll();
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		});
//		or
//		itr.forEach(user->{System.out.println(user);});
		
		//Delete the user
		//deleteById
//		userRepository.deleteById(253);
//		System.out.println("Deleted");
		
//		//deleteAll
//		Iterable<User> allusers = userRepository.findAll();
//		userRepository.deleteAll(allusers);
		
		
		//using coustom method
//		List<User> us = userRepository.findByName("Bhushan Pawase");
//		us.forEach(n->System.out.println(n));
		
//		List<User> us=userRepository.findByNameAndCity("Hrurik Pawase", "Goa");
//		us.forEach(e->System.out.println(e));
		
//		List<User> us=userRepository.getAllUser();
//		us.forEach(e-> System.out.println(e));
		
//		List<User> us=userRepository.getUserByName("Dakshata Pawase");
//		us.forEach(e-> System.out.println(e));
		
		List<User> us=userRepository.getUserByNameAndCity("Dakshata Pawase","Delhi");
		us.forEach(e-> System.out.println(e));
	}

}
