package com.prankur.springSecurity.repository;

import com.prankur.springSecurity.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepos extends CrudRepository<User,Integer> {
    List<User> findByUsername(String username);
}
