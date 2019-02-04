package com.fpl.web;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fpl.dao.UserRepository;
import com.fpl.entities.User;


@RestController
@CrossOrigin("http://localhost:4200")
public class UserRestService {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}

		@RequestMapping(value="/OtherUsers/{userId}", method=RequestMethod.GET)
		public List<User> getOtherUsers(@PathVariable Long userId){
			List<User> other=new ArrayList<>();
			List<User> allUser=userRepository.findAll();
			for(User us:allUser) {
				if(us.getId()!=userId) {
					other.add(us);
				}
			}
			return other;
			
		}
	
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public User saveUser(@RequestBody User u) {
		return userRepository.save(u);
	}
	
	@RequestMapping(value="/getUser/{idUser}", method=RequestMethod.GET)
	public Optional<User> getUserById(@PathVariable Long idUser){
		return userRepository.findById(idUser);
	}
	

	
	

}
