package com.prankur.springSecurity.services;

import com.prankur.springSecurity.entities.Roles;
import com.prankur.springSecurity.entities.User;
import com.prankur.springSecurity.repository.EnumRepos;
import com.prankur.springSecurity.repository.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AppUserDetailsService implements UserDetailsService {

    @Autowired
    EnumRepos enumRepos;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepos userRepos;

    public void initialiseDatabase()
    {
        enumRepos.save(Roles.ADMIN.getRole());
        enumRepos.save(Roles.USER.getRole());
        userRepos.save(new User("admin",passwordEncoder.encode("admin"), Arrays.asList(Roles.ADMIN.getRole(),Roles.USER.getRole()),true,true,true,true));
        userRepos.save(new User("user",passwordEncoder.encode("user"), Arrays.asList(Roles.USER.getRole()),true,true,true,true));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String encryptedPassword = passwordEncoder.encode("admin");
        System.out.println("Trying to authenticate user ::" + username);
        System.out.println("Encrypted Password ::" + encryptedPassword);
        List<User> userList = userRepos.findByUsername(username);
        userList.forEach(System.out::println);
        return userList.get(0);
    }
}
