package com.firstProject.firstSpringProject.user;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;



@Component
public class UserDaoService {
   
	private static List <User> users = new ArrayList<>();
	
	private static int userCount = 0;
	
	static {
//		users.add(new User(++userCount,"Dhananjay",LocalDate.now().minusYears(30)));
//		users.add(new User(++userCount,"Ajay",LocalDate.now().minusYears(20)));
//		users.add(new User(++userCount,"Karan",LocalDate.now().minusYears(15)));
		
		users.add(new User(++userCount,1,"First Name 1","Last Name 1"));
		users.add(new User(++userCount,1,"First Name 2","Last Name 2"));
		users.add(new User(++userCount,1,"First Name 3","Last Name 3"));
		users.add(new User(++userCount,2,"First Name 4","Last Name 4"));
		users.add(new User(++userCount,2,"First Name 5","Last Name 5"));
		users.add(new User(++userCount,2,"First Name 6","Last Name 6"));
		users.add(new User(++userCount,3,"First Name 7","Last Name 7"));
		users.add(new User(++userCount,3,"First Name 8","Last Name 8"));
		users.add(new User(++userCount,4,"First Name 9","Last Name 9"));
		users.add(new User(++userCount,4,"First Name 10","Last Name 10"));
	}
	
	public List<User> findall(){
		return users;
	}
	
	public User findOne(Integer id) {
		Predicate<User> predicate = user -> (user.getId()==id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	


	
	public User save (User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	// delete by id 
	public void deleteById(Integer id) {
		Predicate<?super User> predicate = user -> (user.getId()==id);
		 users.removeIf(predicate);
		
	}
}
