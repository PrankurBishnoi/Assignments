package com.prankur.springSecurity.repository;

import com.prankur.springSecurity.entities.GrantAuthorityImpl;
import org.springframework.data.repository.CrudRepository;

public interface EnumRepos extends CrudRepository<GrantAuthorityImpl,Integer> {
}
