package com.jsp.jspspringboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jsp.jspspringboot.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	//this is custom/programmer defined method
	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name,String city);
	
	@Query("Select u FROM User u")
	public List<User> getAllUser();
	
	@Query("Select u from User u where u.name=:n")
	public List<User> getUserByName(@Param("n") String name);
	
	@Query("Select u from User u where u.name=:n and u.city=:c")
	public List<User> getUserByNameAndCity(@Param("n") String name,@Param("c") String city);
}
