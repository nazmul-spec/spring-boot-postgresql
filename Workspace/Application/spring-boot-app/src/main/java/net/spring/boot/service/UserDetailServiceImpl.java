package net.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.spring.boot.domain.Users;
import net.spring.boot.repository.UserRepository;


/**
 * This class is used by spring controller to authenticate and authorize user
 **/
@Service
public class UserDetailServiceImpl implements UserDetailsService  {
	private final UserRepository repository;

	@Autowired
	public UserDetailServiceImpl(UserRepository repository) {
		this.repository = repository;
	}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {   
    	Users curruser = repository.findByUsername(username);
    	
        UserDetails user = new org.springframework.security.core.userdetails.User(username, curruser.getPasswordHash(), true, 
        		true, true, true, AuthorityUtils.createAuthorityList(curruser.getRole()));
        
        System.out.println("ROLE: " + curruser.getRole());
        return user;
    }
    
}