package com.yamaha.security.impl;

import com.yamaha.entity.UserEntity;
import com.yamaha.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername (username);
       if (user == null){
           throw new UsernameNotFoundException(username);
       }
       return new UserDetailsImpl(user);
    }
}
